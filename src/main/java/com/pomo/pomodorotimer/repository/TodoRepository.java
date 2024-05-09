package com.pomo.pomodorotimer.repository;

import com.pomo.pomodorotimer.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

   Todo getTodoByIdAndUserId(Long id, Long userId);

   List<Todo> getTodosByUserId(Long userId);
}
