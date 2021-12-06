package org.example.controller.implementation;

import org.example.controller.AbstractController;
import org.example.model.dao.implementation.AbstractGenericImpl;

import java.util.List;

public abstract class AbstractGenericControllerImpl<E> implements AbstractController<E> {
    public abstract AbstractGenericImpl<E> getDao();

    @Override
    public List<E> findAll() {
        return (List<E>) getDao().findAll();
    }

    @Override
    public E findById(Integer id) {
        return getDao().findOne(id);
    }

    @Override
    public void create(E object) {
        getDao().create(object);
    }

    @Override
    public void update(Integer id, E object) {
        getDao().update(id, object);
    }

    @Override
    public void delete(Integer id) {
        getDao().delete(id);
    }

}