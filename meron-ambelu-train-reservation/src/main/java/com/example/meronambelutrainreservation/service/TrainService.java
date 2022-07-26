package com.example.meronambelutrainreservation.service;

import com.example.meronambelutrainreservation.model.Ticket;
import com.example.meronambelutrainreservation.model.Train;
import com.example.meronambelutrainreservation.repository.TicketRepository;
import com.example.meronambelutrainreservation.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Train createTrain(Train train) {
        return trainRepository.save(train);
    }

    public Train getTrainById(Integer trainId) {
        Optional<Train> train = trainRepository.findById(trainId);
        return train.isPresent() ? train.get() : null;
    }

    public List<Train> findAllTrains() {
        return trainRepository.findAll();
    }

    public void updateTrain(Train train) {
        trainRepository.save(train);
    }

    public void deleteTrainById(Integer trainId) {
        trainRepository.deleteById(trainId);
    }



}
