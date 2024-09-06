package com.example.demo.serviceimpl;

import com.example.demo.model.ResponseVo;
import com.example.demo.model.TodoDto;

public interface TodoServiceImpl {
    ResponseVo<TodoDto> getTodoList(String userId, boolean isDone);
    ResponseVo<TodoDto> addTodoItem(TodoDto todoDto);
    ResponseVo<TodoDto> updateTodoItem(TodoDto todoDto);
    ResponseVo<TodoDto> deleteTodoItem(String todoId, String userId);
}
