package com.horetskyi.demo.controller;

import com.horetskyi.demo.dto.RouteDto;
import com.horetskyi.demo.entity.Route;
import com.horetskyi.demo.service.implementation.RouteService;
import com.horetskyi.demo.util.dto_mapper.RouteDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.*;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private final RouteService routeService;
    private final RouteDtoMapper routeDtoMapper;

    public RouteController(RouteService routeService, RouteDtoMapper routeDtoMapper) {
        this.routeService = routeService;
        this.routeDtoMapper = routeDtoMapper;
    }

    @GetMapping
    public List<RouteDto> getRoutes() {
        return routeService.findAll().stream()
                .map(routeDtoMapper::mapToDto)
                .collect(toList());
    }

    @GetMapping("/{id}")
    public RouteDto getRouteById(@PathVariable int id) {
        return routeDtoMapper.mapToDto(routeService.find(id));
    }

    @PostMapping
    public RouteDto createRoute(@RequestBody Route route) {
        return routeDtoMapper.mapToDto(routeService.create(route));
    }

    @PutMapping("/{id}")
    public RouteDto updateRoute(@RequestBody Route route, @PathVariable int id) {
        route.setId(id);
        return routeDtoMapper.mapToDto(routeService.update(route));
    }

    @DeleteMapping("/{id}")
    public RouteDto deleteRoute(@PathVariable int id) {
        return routeDtoMapper.mapToDto(routeService.delete(id));

    }

}
