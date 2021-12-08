package com.horetskyi.demo.controller;

import com.horetskyi.demo.dto.RatingDto;
import com.horetskyi.demo.entity.Rating;
import com.horetskyi.demo.service.implementation.RatingService;
import com.horetskyi.demo.util.dto_mapper.RatingDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.*;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    private final RatingService ratingService;
    private final RatingDtoMapper ratingDtoMapper;

    public RatingController(RatingService ratingService, RatingDtoMapper ratingDtoMapper) {
        this.ratingService = ratingService;
        this.ratingDtoMapper = ratingDtoMapper;
    }

    @GetMapping
    public List<RatingDto> getRatings() {
        return ratingService.findAll().stream()
                .map(ratingDtoMapper::mapToDto)
                .collect(toList());
    }

    @GetMapping("/{id}")
    public RatingDto getRatingById(@PathVariable int id) {
        return ratingDtoMapper.mapToDto(ratingService.find(id));
    }

    @PostMapping
    public RatingDto createRating(@RequestBody Rating rating) {
        return ratingDtoMapper.mapToDto(ratingService.create(rating));
    }

    @PutMapping("/{id}")
    public RatingDto updateRating(@RequestBody Rating rating, @PathVariable int id) {
        rating.setId(id);
        return ratingDtoMapper.mapToDto(ratingService.update(rating));
    }

    @DeleteMapping("/{id}")
    public RatingDto deleteRating(@PathVariable int id) {
        return ratingDtoMapper.mapToDto(ratingService.delete(id));
    }

}
