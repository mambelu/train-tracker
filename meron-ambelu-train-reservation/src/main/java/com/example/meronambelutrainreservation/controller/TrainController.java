package com.example.meronambelutrainreservation.controller;

import com.example.meronambelutrainreservation.model.Train;
import com.example.meronambelutrainreservation.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class TrainController {
    @Autowired
    TrainService trainServiceLayer;

    @PostMapping("/train")
    public Train addTrain (@RequestBody Train train) {
        return trainServiceLayer.createTrain(train);
    }

    @GetMapping("/train")
    public List<Train> getAllTrains () {

        return trainServiceLayer.findAllTrains();
    }

    @GetMapping ("/train/{trainId}")
    public Train getTrainById (@PathVariable Integer trainId){
        return trainServiceLayer.getTrainById(trainId);
    }

    @PutMapping ("/train")
    public void updateTrain(@RequestBody Train train) {
        trainServiceLayer.updateTrain(train);
    }

    @DeleteMapping ("/train/{trainId}")
    public void deleteTrain(@PathVariable Integer trainId) {
        trainServiceLayer.deleteTrainById(trainId);
    }
}
