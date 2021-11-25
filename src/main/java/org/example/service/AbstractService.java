package org.example.service;

import java.util.List;

public interface AbstractService<E> {
    List<E> findAll();

    E findOne(Integer id);

    void create(E object);

    void update(Integer id, E object);

    void delete(Integer id);
}