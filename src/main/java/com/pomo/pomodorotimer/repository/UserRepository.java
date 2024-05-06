package com.pomo.pomodorotimer.repository;

import com.pomo.pomodorotimer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
