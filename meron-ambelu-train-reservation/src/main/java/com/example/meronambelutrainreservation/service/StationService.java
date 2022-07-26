package com.example.meronambelutrainreservation.service;

import com.example.meronambelutrainreservation.model.Station;
import com.example.meronambelutrainreservation.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StationService {
    @Autowired
    private StationRepository stationRepository;

    @Autowired

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Station createStation(Station station) {
        return stationRepository.save(station);
    }

    public Station getStationById(Integer routeId) {
        Optional<Station> station = stationRepository.findById(routeId);
        return station.isPresent() ? station.get() : null;
    }

    public List<Station> findAllStations() {
        return stationRepository.findAll();
    }


    public void updateStation(Station station) {
        stationRepository.save(station);
    }

    public void deleteStation(Integer routeId) {
        stationRepository.deleteById(routeId);
    }
}
