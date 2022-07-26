package com.example.meronambelutrainreservation.controller;

import com.example.meronambelutrainreservation.model.RouteStation;
import com.example.meronambelutrainreservation.service.RouteStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class RouteStationController {
    @Autowired
    RouteStationService routeStationServiceLayer;

    @PostMapping("/routeStation")
    public RouteStation addRouteStation (@RequestBody RouteStation routeStation) {
        return routeStationServiceLayer.createRouteStation(routeStation);
    }

    @GetMapping("/routeStation")
    public List<RouteStation> getAllRoutStation () {

        return routeStationServiceLayer.findAllRoutStations();
    }

    @GetMapping ("/routeStation/{routeId}")
    public RouteStation getRoutStationByRouteId (@PathVariable Integer routeId){
        return routeStationServiceLayer.getRoutsStationByRouteId(routeId);
    }

    @PutMapping ("/routeStation")
    public void updateRouteStation(@RequestBody RouteStation routeStation) {
        routeStationServiceLayer.updateRouteStation(routeStation);
    }

    @DeleteMapping ("/routeStation/{routeId}")
    public void deleteRouteStation(@PathVariable Integer routeId) {
        routeStationServiceLayer.deleteRouteStation(routeId);
    }
}
