package com.horetskyi.demo.controller;

import com.horetskyi.demo.dto.DriverDto;
import com.horetskyi.demo.entity.Driver;
import com.horetskyi.demo.entity.Route;
import com.horetskyi.demo.service.implementation.DriverService;
import com.horetskyi.demo.service.implementation.RouteService;
import com.horetskyi.demo.util.dto_mapper.DriverDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.*;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService driverService;
    private final DriverDtoMapper driverDtoMapper;
    private final RouteService routeService;

    public DriverController(DriverService driverService, DriverDtoMapper driverDtoMapper, RouteService routeService) {
        this.driverService = driverService;
        this.driverDtoMapper = driverDtoMapper;
        this.routeService = routeService;
    }

    @GetMapping
    public List<DriverDto> getDrivers() {
        return driverService.findAll().stream()
                .map(driverDtoMapper::mapToDto)
                .collect(toList());
    }

    @GetMapping("/{id}")
    public DriverDto getDriverById(@PathVariable int id) {
        return driverDtoMapper.mapToDto(driverService.find(id));
    }

    @PostMapping
    public DriverDto createDriver(@RequestBody Driver driver) {
        return driverDtoMapper.mapToDto(driverService.create(driver));
    }

    @PutMapping("/{id}")
    public DriverDto updateDriver(@RequestBody Driver driver, @PathVariable int id) {
        driver.setId(id);
        return driverDtoMapper.mapToDto(driverService.update(driver));
    }

    @DeleteMapping("/{id}")
    public DriverDto deleteDriver(@PathVariable int id) {
        List<Route> routes = routeService.findAll();
        for (Route route: routes) {
            if (route.getDriver().getId().equals(id)) {
                routeService.delete(route.getId());
            }
        }
        return driverDtoMapper.mapToDto(driverService.delete(id));
    }
}
