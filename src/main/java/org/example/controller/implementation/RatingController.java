package org.example.controller.implementation;


import org.example.model.dao.implementation.AbstractGenericImpl;
import org.example.model.dao.implementation.RatingDao;
import org.example.model.entity.Rating;


public class RatingController extends AbstractGenericControllerImpl<Rating>{
    private final RatingDao ratingDao = new RatingDao();

    @Override
    public AbstractGenericImpl<Rating> getDao(){
        return ratingDao;
    }

}