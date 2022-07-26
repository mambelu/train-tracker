package com.example.meronambelutrainreservation.repository;

import com.example.meronambelutrainreservation.model.RouteStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutStationRepository extends JpaRepository<RouteStation, Integer> {
}
