package org.example.controller.implementation;

import org.example.controller.AbstractController;
import org.example.model.entity.Rating;
import org.example.service.implementation.RatingService;

import java.util.List;

public class RatingController implements AbstractController<Rating> {

    RatingService ratingService = new RatingService();

    @Override
    public List<Rating> findAll() {
        return ratingService.findAll();
    }

    @Override
    public Rating findById(Integer id) {
        return ratingService.findOne(id);
    }

    @Override
    public void create(Rating entity) {
        ratingService.create(entity);
    }

    @Override
    public void update(Integer id, Rating entity) {
        ratingService.update(id,entity);
    }

    @Override
    public void delete(Integer id) {
        ratingService.delete(id);
    }
}
