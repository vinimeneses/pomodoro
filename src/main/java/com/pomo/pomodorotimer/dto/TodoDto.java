package com.pomo.pomodorotimer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private Long id;
    private String title;
    private String description;
    private Integer initialQuantity = 0;
    private Integer quantity;
    private boolean done;
    private Long userId;
}
