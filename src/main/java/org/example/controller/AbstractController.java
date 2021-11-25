package org.example.controller;

import java.util.List;

public interface AbstractController <E> {

    List<E> findAll();

    E findById(Integer id);

    void create(E entity);

    void update(Integer id, E entity);

    void delete(Integer id);
}
