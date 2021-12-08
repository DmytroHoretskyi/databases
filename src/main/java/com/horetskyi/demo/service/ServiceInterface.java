package com.horetskyi.demo.service;

import java.util.List;

public interface ServiceInterface<T> {

    List<T> findAll();

    T find(Integer id);

    T create(T entity);

    T update(T entity);

    T delete(Integer id);
}
