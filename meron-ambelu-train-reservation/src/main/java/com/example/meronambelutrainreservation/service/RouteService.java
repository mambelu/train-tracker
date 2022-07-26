package com.example.meronambelutrainreservation.service;

import com.example.meronambelutrainreservation.model.Customer;
import com.example.meronambelutrainreservation.model.Route;
import com.example.meronambelutrainreservation.model.Train;
import com.example.meronambelutrainreservation.repository.RoutRepository;
import com.example.meronambelutrainreservation.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RouteService {
    @Autowired
    private RoutRepository routeRepository;

    @Autowired
    public RouteService(RoutRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }

    public Route getRoutById(Integer routeId) {
        Optional<Route> route = routeRepository.findById(routeId);
        return route.isPresent() ? route.get() : null;
    }

    public List<Route> findAllRouts() {
        return routeRepository.findAll();
    }
    public void deleteRoute(Integer routeId) {  routeRepository.deleteById(routeId);  }


    public void updateRoute(Route route) {
        routeRepository.save(route);
    }

}
