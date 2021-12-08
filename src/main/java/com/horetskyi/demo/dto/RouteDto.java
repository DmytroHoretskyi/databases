package com.horetskyi.demo.dto;

import com.horetskyi.demo.entity.Driver;
import com.horetskyi.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteDto {
    private Integer id;

    private String start;

    private String end;

    private String data;

    private Integer price;

    private User user;

    private Driver driver;
}
