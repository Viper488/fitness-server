package com.fitness;

import com.fitness.domain.FitnessFacade;
import com.fitness.dto.PersonDto;
import com.fitness.dto.TrainingExercisesDto;
import com.fitness.dto.TrainingsDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class FitnessController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FitnessController.class);

    private final FitnessFacade fitnessFacade;

    FitnessController(FitnessFacade fitnessFacade) {
        this.fitnessFacade = fitnessFacade;
    }

    @CrossOrigin
    @GetMapping("/api/trainings")
    List<TrainingsDto> getTrainings(){
        return fitnessFacade.getTrainings();
    }

    @CrossOrigin
    @GetMapping("/api/exercises")
    TrainingExercisesDto getExercises(@RequestParam("id") Long idTraining){
        return fitnessFacade.getExercises(idTraining);
    }

    @CrossOrigin
    @GetMapping("/api/bmi")
    double calculateBmi(@RequestParam("height") double height, @RequestParam("weight") double weight){
        return fitnessFacade.calculateBmi(height, weight);
    }
}
