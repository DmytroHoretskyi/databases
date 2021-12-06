package org.example.controller;

import org.example.model.dao.implementation.AbstractGenericImpl;

import java.util.List;

public interface AbstractController <E> {

    AbstractGenericImpl<E> getDao();

    List<E> findAll();

    E findById(Integer id);

    void create(E entity);

    void update(Integer id, E entity);

    void delete(Integer id);
}
