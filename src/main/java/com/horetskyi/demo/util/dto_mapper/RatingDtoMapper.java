package com.horetskyi.demo.util.dto_mapper;

import com.horetskyi.demo.dto.RatingDto;
import com.horetskyi.demo.entity.Rating;
import org.springframework.stereotype.Component;

@Component
public class RatingDtoMapper {
    public RatingDto mapToDto(Rating rating) {
        return new RatingDto(
                rating.getId(),
                rating.getStars()

        );
    }

    public Rating mapToObj(RatingDto ratingDto) {
        return new Rating(
                ratingDto.getId(),
                ratingDto.getStars()
        );
    }
}
