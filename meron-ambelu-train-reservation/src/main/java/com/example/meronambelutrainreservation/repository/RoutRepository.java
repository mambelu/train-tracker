package com.example.meronambelutrainreservation.repository;

import com.example.meronambelutrainreservation.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutRepository extends JpaRepository<Route, Integer> {
}
