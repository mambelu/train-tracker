package com.example.meronambelutrainreservation.controller;

import com.example.meronambelutrainreservation.model.Route;

import com.example.meronambelutrainreservation.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class RouteController {
    @Autowired
    RouteService routeServiceLayer;

    @PostMapping("/route")
    public Route addRoute (@RequestBody Route route) {
        return routeServiceLayer.createRoute(route);
    }

    @GetMapping("/route")
    public List<Route> getAllRoutes () {

        return routeServiceLayer.findAllRouts();
    }

    @GetMapping ("/route/{routeId}")
    public Route getRouteById (@PathVariable Integer routeId){
        return routeServiceLayer.getRoutById(routeId);
    }

    @PutMapping ("/route")
    public void updateRoute(@RequestBody Route route) {
        routeServiceLayer.updateRoute(route);
    }

    @DeleteMapping ("/route/{routeId}")
    public void deleteRoute(@PathVariable Integer routeId) {
        routeServiceLayer.deleteRoute(routeId);
    }

}
