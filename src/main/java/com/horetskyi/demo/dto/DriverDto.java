package com.horetskyi.demo.dto;

import com.horetskyi.demo.entity.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private Integer id;

    private String name;

    private String surname;

    private Integer age;

    private Integer numberOfCars;

    private Integer experience;

    private Rating rating;
}
