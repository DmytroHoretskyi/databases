package com.horetskyi.demo.util.dto_mapper;

import com.horetskyi.demo.dto.CarDto;
import com.horetskyi.demo.entity.Car;
import org.springframework.stereotype.Component;

@Component
public final class CarDtoMapper {

    public CarDto mapToDto(Car car) {
        CarDto carDto = new CarDto();

        carDto.setMark(car.getMark());
        carDto.setModel(car.getModel());
        carDto.setColor(car.getColor());
        carDto.setCarNumber(car.getCarNumber());

        return carDto;
    }

    public Car mapToObj(CarDto carDto) {
        return new Car(
                carDto.getId(),
                carDto.getModel(),
                carDto.getMark(),
                carDto.getColor(),
                carDto.getCarNumber()
        );
    }
}
