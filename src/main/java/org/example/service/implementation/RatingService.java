package org.example.service.implementation;

import org.example.model.dao.implementation.RatingDao;
import org.example.model.entity.Rating;
import org.example.service.AbstractService;

import java.util.List;

public class RatingService implements AbstractService<Rating> {

    RatingDao ratingDao = new RatingDao();

    @Override
    public List<Rating> findAll() {
        return ratingDao.findAll();
    }

    @Override
    public Rating findOne(Integer id) {
        return ratingDao.findOne(id);
    }

    @Override
    public void create(Rating object) {
        ratingDao.create(object);
    }

    @Override
    public void update(Integer id, Rating object) {
        ratingDao.update(id,object);
    }

    @Override
    public void delete(Integer id) {
        ratingDao.delete(id);
    }
}
