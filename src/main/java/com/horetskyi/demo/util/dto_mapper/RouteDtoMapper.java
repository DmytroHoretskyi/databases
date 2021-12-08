package com.horetskyi.demo.util.dto_mapper;

import com.horetskyi.demo.dto.RouteDto;
import com.horetskyi.demo.entity.Route;
import org.springframework.stereotype.Component;

@Component
public class RouteDtoMapper {
    public RouteDto mapToDto(Route route) {
        return new RouteDto(
                route.getId(),
                route.getStart(),
                route.getEnd(),
                route.getData(),
                route.getPrice(),
                route.getUser(),
                route.getDriver()

        );
    }

    public Route mapToObj(RouteDto routeDto) {
        return new Route(
                routeDto.getId(),
                routeDto.getStart(),
                routeDto.getEnd(),
                routeDto.getData(),
                routeDto.getPrice(),
                routeDto.getUser(),
                routeDto.getDriver()
        );
    }
}
