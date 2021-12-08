package com.horetskyi.demo.controller;

import com.horetskyi.demo.dto.CarDto;
import com.horetskyi.demo.entity.Car;
import com.horetskyi.demo.service.implementation.CarService;
import com.horetskyi.demo.util.dto_mapper.CarDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;
    private final CarDtoMapper carDtoMapper;

    public CarController(CarService carService, CarDtoMapper carDtoMapper) {
        this.carService = carService;
        this.carDtoMapper = carDtoMapper;
    }

    @GetMapping
    public List<CarDto> getCars() {
        return carService.findAll().stream()
                .map(carDtoMapper::mapToDto)
                .collect(toList());
    }

    @GetMapping("/{id}")
    public CarDto getCarById(@PathVariable int id) {
        return carDtoMapper.mapToDto(carService.find(id));
    }

    @PostMapping
    public CarDto createCar(@RequestBody Car car) {
        return carDtoMapper.mapToDto(carService.create(car));
    }

    @PutMapping("/{id}")
    public CarDto updateCar(@RequestBody Car car, @PathVariable int id) {
        car.setId(id);
        return carDtoMapper.mapToDto(carService.update(car));
    }

    @DeleteMapping("/{id}")
    public CarDto deleteCar(@PathVariable int id) {
        return carDtoMapper.mapToDto(carService.delete(id));
    }

}
