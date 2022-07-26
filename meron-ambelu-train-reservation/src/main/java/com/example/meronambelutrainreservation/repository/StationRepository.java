package com.example.meronambelutrainreservation.repository;

import com.example.meronambelutrainreservation.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
}
