package com.pomo.pomodorotimer.controller;

import com.pomo.pomodorotimer.dto.TodoDto;
import com.pomo.pomodorotimer.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/create")
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto, @RequestParam Long userId) {
        return ResponseEntity.ok(todoService.createTodo(todoDto, userId));
    }
}
