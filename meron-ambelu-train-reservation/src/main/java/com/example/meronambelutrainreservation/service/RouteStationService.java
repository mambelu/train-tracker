package com.example.meronambelutrainreservation.service;

import com.example.meronambelutrainreservation.model.Route;
import com.example.meronambelutrainreservation.model.RouteStation;
import com.example.meronambelutrainreservation.repository.RoutRepository;
import com.example.meronambelutrainreservation.repository.RoutStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RouteStationService {
    @Autowired
    private RoutStationRepository routStationRepository;

    @Autowired
    public RouteStationService(RoutStationRepository routStationRepository) {
        this.routStationRepository = routStationRepository;
    }

    public RouteStation createRouteStation(RouteStation routeStation) {
        return routStationRepository.save(routeStation);
    }

    public RouteStation getRoutsStationByRouteId(Integer routeId) {
        Optional<RouteStation> routeStation = routStationRepository.findById(routeId);
        return routeStation.isPresent() ? routeStation.get() : null;
    }

    public List<RouteStation> findAllRoutStations() {
        return routStationRepository.findAll();
    }
    public void deleteRouteStation(Integer routeId) {  routStationRepository.deleteById(routeId);  }


    public void updateRouteStation(RouteStation routeStation) {
        routStationRepository.save(routeStation);
    }
}
