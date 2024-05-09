package com.pomo.pomodorotimer.controller;

import com.pomo.pomodorotimer.dto.TodoDto;
import com.pomo.pomodorotimer.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/create/{userId}")
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto, @PathVariable Long userId) {
        return new ResponseEntity<>(todoService.createTodo(todoDto, userId), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDto> getTodoById(@PathVariable Long id) {
        return new ResponseEntity<>(todoService.getTodoById(id), HttpStatus.OK);
    }

    @GetMapping("/getall/{userId}")
    public ResponseEntity<List<TodoDto>> getTodosByUserId(@PathVariable Long userId) {
        return new ResponseEntity<>(todoService.getTodosByUserId(userId), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoDto> updateTodoById(@PathVariable Long id, @RequestBody TodoDto todoDto) {
        return new ResponseEntity<>(todoService.updateTodoById(id, todoDto), HttpStatus.OK);
    }
}
