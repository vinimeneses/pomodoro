package com.pomo.pomodorotimer.repository;

import com.pomo.pomodorotimer.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
