package com.example.demo.controller;

import com.example.demo.model.ResponseVo;
import com.example.demo.model.TodoDto;
import com.example.demo.serviceimpl.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;

@Validated
@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoServiceImpl todoService;

    /**
     * Get todolist
     * @param userId user id
     * @return ResponseVo<TodoDto>
     */
    @RequestMapping(value="/get", method= RequestMethod.GET)
    public ResponseVo<TodoDto> get(@NotEmpty(message = "userId cannot be empty!") @RequestParam(name = "user_id") String userId,
                                   @RequestParam(name = "is_done") boolean isDone) {
        return todoService.getTodoList(userId, isDone);
    }

    /**
     * create a new todoitem
     */
    @RequestMapping(value="/add", method= RequestMethod.POST)
    public ResponseVo<TodoDto> add(@RequestBody TodoDto todoDto) {
        return todoService.addTodoItem(todoDto);
    }

    /**
     * update an existing todoitem
     */
    @RequestMapping(value="/update", method= RequestMethod.POST)
    public ResponseVo<TodoDto> update(@RequestBody TodoDto todoDto) {
        return todoService.updateTodoItem(todoDto);
    }

    /**
     * delete an item by id
     */
    @RequestMapping(value="/delete", method= RequestMethod.DELETE)
    public ResponseVo<TodoDto> delete(@RequestParam(name = "todo_id") String todoId,
                                      @RequestParam(name = "user_id") String userId) {
        return todoService.deleteTodoItem(todoId, userId);
    }
}
