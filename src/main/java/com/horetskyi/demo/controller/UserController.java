package com.horetskyi.demo.controller;

import com.horetskyi.demo.dto.UserDto;
import com.horetskyi.demo.entity.Route;
import com.horetskyi.demo.entity.User;
import com.horetskyi.demo.service.implementation.RouteService;
import com.horetskyi.demo.service.implementation.UserService;
import com.horetskyi.demo.util.dto_mapper.UserDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserDtoMapper userDtoMapper;
    private final RouteService routeService;

    public UserController(UserService userService, UserDtoMapper userDtoMapper, RouteService routeService) {
        this.userService = userService;
        this.userDtoMapper = userDtoMapper;
        this.routeService = routeService;
    }

    @GetMapping
    public List<UserDto> getUsers() {
        return userService.findAll().stream()
                .map(userDtoMapper::mapToDto)
                .collect(toList());
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable int id) {
        return userDtoMapper.mapToDto(userService.find(id));
    }

    @PostMapping
    public UserDto createUser(@RequestBody User user) {
        return userDtoMapper.mapToDto(userService.create(user));
    }

    @PutMapping("/{id}")
    public UserDto updateUser(@RequestBody User user, @PathVariable int id) {
        user.setId(id);
        return userDtoMapper.mapToDto(userService.update(user));
    }

    @DeleteMapping("/{id}")
    public UserDto deleteUser(@PathVariable int id) {
        List<Route> routes = routeService.findAll();
        for (Route route: routes) {
            if (route.getDriver().getId().equals(id)) {
                routeService.delete(route.getId());
            }
        }
        return null;
    }

}
