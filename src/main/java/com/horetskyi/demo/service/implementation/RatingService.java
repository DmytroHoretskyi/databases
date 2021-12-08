package com.horetskyi.demo.service.implementation;

import com.horetskyi.demo.entity.Rating;
import com.horetskyi.demo.repository.RatingRepo;
import com.horetskyi.demo.service.ServiceInterface;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RatingService implements ServiceInterface<Rating> {

    private final RatingRepo ratingRepo;

    public RatingService(RatingRepo ratingRepo) {
        this.ratingRepo = ratingRepo;
    }

    @Override
    public List<Rating> findAll() {
        return ratingRepo.findAll();
    }

    @Override
    public Rating find(Integer id) {
        return ratingRepo.getById(id);
    }

    @Override
    @Transactional
    public Rating create(Rating entity) {
        return ratingRepo.save(entity);
    }

    @Override
    @Transactional
    public Rating update(Rating entity) {
        return ratingRepo.save(entity);
    }

    @Override
    @Transactional
    public Rating delete(Integer id) {
        Rating rating = ratingRepo.getById(id);
        ratingRepo.deleteById(id);
        return rating;
    }
}
