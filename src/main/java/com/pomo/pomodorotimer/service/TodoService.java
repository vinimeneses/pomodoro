package com.pomo.pomodorotimer.service;

import com.pomo.pomodorotimer.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto createTodo(TodoDto todoDto, Long user);

    TodoDto getTodoById(Long id);

    List<TodoDto> getTodosByUserId(Long userId);
}
