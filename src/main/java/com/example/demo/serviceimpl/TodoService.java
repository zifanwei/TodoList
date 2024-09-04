package com.example.demo.serviceimpl;

import com.example.demo.model.ResponseVo;
import com.example.demo.model.TodoDto;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TodoService implements TodoServiceImpl {
    @Override
    public ResponseVo<TodoDto> getTodoList(String userId, boolean isDone) {
        /**
         * TODO:
         * get todolist that deadline is today.
         */
        return null;
    }

    @Override
    public ResponseVo<TodoDto> addTodoItem(TodoDto todoDto) {
        ResponseVo<TodoDto> responseVo = new ResponseVo<>();
        if (Objects.isNull(todoDto)) {
            return responseVo.failed();
        }
        return null;
    }

    @Override
    public ResponseVo<TodoDto> updateTodoItem(TodoDto todoDto) {
        return null;
    }

    @Override
    public ResponseVo<TodoDto> deleteTodoItem(String todoId) {
        return null;
    }
}
