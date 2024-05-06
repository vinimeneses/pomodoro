package com.pomo.pomodorotimer.service;

import com.pomo.pomodorotimer.dto.TodoDto;

public interface TodoService {

    TodoDto createTodo(TodoDto todoDto, Long user);

}
