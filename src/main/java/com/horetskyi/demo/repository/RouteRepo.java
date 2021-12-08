package com.horetskyi.demo.repository;


import com.horetskyi.demo.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepo extends JpaRepository<Route, Integer> {
}
