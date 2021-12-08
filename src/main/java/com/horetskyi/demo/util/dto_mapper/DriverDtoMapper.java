package com.horetskyi.demo.util.dto_mapper;

import com.horetskyi.demo.dto.DriverDto;
import com.horetskyi.demo.entity.Driver;
import org.springframework.stereotype.Component;

@Component
public class DriverDtoMapper {
    public DriverDto mapToDto(Driver driver) {
        return new DriverDto(
                driver.getId(),
                driver.getName(),
                driver.getSurname(),
                driver.getAge(),
                driver.getNumberOfCars(),
                driver.getExperience(),
                driver.getRating()
        );
    }

    public Driver mapToObj(DriverDto driverDto) {
        return new Driver(
                driverDto.getId(),
                driverDto.getName(),
                driverDto.getSurname(),
                driverDto.getAge(),
                driverDto.getNumberOfCars(),
                driverDto.getExperience(),
                driverDto.getRating()
        );
    }
}
