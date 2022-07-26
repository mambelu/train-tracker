package com.example.meronambelutrainreservation.controller;

import com.example.meronambelutrainreservation.model.Station;
import com.example.meronambelutrainreservation.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class StationController {
    @Autowired
    StationService stationServiceLayer;

    @PostMapping("/station")
    public Station addStation (@RequestBody Station station) {
        return stationServiceLayer.createStation(station);
    }

    @GetMapping("/station")
    public List<Station> getAllStations () {

        return stationServiceLayer.findAllStations();
    }

    @GetMapping ("/station/{stationId}")
    public Station getStationById (@PathVariable Integer stationId){
        return stationServiceLayer.getStationById(stationId);
    }

    @PutMapping ("/station")
    public void updateStation(@RequestBody Station station) {
        stationServiceLayer.updateStation(station);
    }

    @DeleteMapping ("/station/{stationId}")
    public void deleteStation(@PathVariable Integer stationId) {
        stationServiceLayer.deleteStation(stationId);
    }


}
