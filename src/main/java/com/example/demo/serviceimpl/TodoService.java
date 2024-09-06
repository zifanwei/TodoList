package com.example.demo.serviceimpl;

import com.example.demo.dao.TodoDao;
import com.example.demo.model.ResponseVo;
import com.example.demo.model.TodoDto;
import com.example.demo.po.TodoPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TodoService implements TodoServiceImpl {
    private final TodoDao todoDao;

    @Autowired
    public TodoService(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    public ResponseVo<TodoDto> getTodoList(String userId, boolean isDone) {
        ResponseVo<TodoDto> responseVo = new ResponseVo<>();
        List<TodoPo> todoList = todoDao.getTodoList(userId, isDone);
        if (todoList.isEmpty()) {
            return responseVo.success(null);
        }
        List<TodoDto> todoDtoList = todoList.stream()
                .map(TodoPo::toDto)
                .collect(Collectors.toList());
        return responseVo.success(todoDtoList);
    }

    @Override
    public ResponseVo<TodoDto> addTodoItem(TodoDto todoDto) {
        ResponseVo<TodoDto> responseVo = new ResponseVo<>();
        if (Objects.isNull(todoDto)) {
            return responseVo.failed("Todo is null.");
        }
        todoDto.initialise();
        int affectedRows = todoDao.addTodoItem(todoDto.toTodoPo());
        if (affectedRows <= 0) {
            return responseVo.failed("Add Todo item failed.");
        }
        return responseVo.success(List.of(todoDto));
    }

    @Override
    public ResponseVo<TodoDto> updateTodoItem(TodoDto todoDto) {
        ResponseVo<TodoDto> responseVo = new ResponseVo<>();
        if (Objects.isNull(todoDto)) {
            return responseVo.failed("Todo is null.");
        }
        // allow changing of content, deadline, priority and isDone.
        int affectedRows = todoDao.updateTodoItem(todoDto.toTodoPo());
        if (affectedRows <= 0) {
            return responseVo.failed("update Todo item failed.");
        }
        return responseVo.success(List.of(todoDto));
    }

    @Override
    public ResponseVo<TodoDto> deleteTodoItem(String todoId, String userId) {
        ResponseVo<TodoDto> responseVo = new ResponseVo<>();
        if (Objects.isNull(todoId) || todoId.isBlank()) {
            return responseVo.failed("Todo Id is empty.");
        }
        int affectedRows = todoDao.deleteTodoItemById(todoId, userId);
        if (affectedRows <= 0) {
            return responseVo.failed("delete Todo item failed.");
        }
        return responseVo.success(null);
    }
}
