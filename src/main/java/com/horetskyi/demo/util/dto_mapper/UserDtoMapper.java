package com.horetskyi.demo.util.dto_mapper;

import com.horetskyi.demo.dto.UserDto;
import com.horetskyi.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public UserDto mapToDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getSurname(),
                user.getAge(),
                user.getGender()

        );
    }

    public User mapToObj(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getSurname(),
                userDto.getAge(),
                userDto.getGender()
        );
    }
}
