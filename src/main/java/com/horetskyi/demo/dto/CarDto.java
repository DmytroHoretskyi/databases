package com.horetskyi.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private Integer id;

    private String model;

    private  String mark;

    private String color;

    private String carNumber;
}
