package com.pomo.pomodorotimer.service.impl;

import com.pomo.pomodorotimer.dto.TodoDto;
import com.pomo.pomodorotimer.entity.Todo;
import com.pomo.pomodorotimer.entity.User;
import com.pomo.pomodorotimer.repository.TodoRepository;
import com.pomo.pomodorotimer.repository.UserRepository;
import com.pomo.pomodorotimer.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public TodoServiceImpl(TodoRepository todoRepository, ModelMapper modelMapper, UserRepository userRepository) {
        this.todoRepository = todoRepository;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    public TodoDto createTodo(TodoDto todoDto, Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Todo todo = modelMapper.map(todoDto, Todo.class);
        todo.setUser(user);
        return modelMapper.map(todoRepository.save(todo), TodoDto.class);
    }

    @Override
    public TodoDto getTodoById(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        return modelMapper.map(todo, TodoDto.class);
    }


    @Override
    public List<TodoDto> getTodosByUserId(Long userId) {
        List<Todo> todos = todoRepository.getTodosByUserId(userId);
        return todos.stream().map(todo -> modelMapper.map(todo, TodoDto.class)).toList();
    }
}
