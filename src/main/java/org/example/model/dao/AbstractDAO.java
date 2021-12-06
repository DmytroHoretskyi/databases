package org.example.model.dao;


import java.util.List;

public interface AbstractDAO<E> {

    List<E> findAll();

    E findOne(Integer id);

    void create(E object);

    void update(Integer id, E object);

    void delete(Integer id);
}
