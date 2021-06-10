package com.fitness;

import com.fitness.domain.FitnessFacade;
import com.fitness.dto.PersonTrainingDto;
import com.fitness.dto.TrainingExercisesDto;
import com.fitness.dto.TrainingDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class FitnessController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FitnessController.class);

    private final FitnessFacade fitnessFacade;

    FitnessController(FitnessFacade fitnessFacade) {
        this.fitnessFacade = fitnessFacade;
    }

    @CrossOrigin
    @GetMapping("/api/trainings")
    List<TrainingDto> getTrainings(){
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

    @CrossOrigin
    @GetMapping("/api/person/training")
    List<PersonTrainingDto> getPersonTrainings(@RequestParam("id") Long idPerson){
        return fitnessFacade.getPersonTrainings(idPerson);
    }

    @CrossOrigin
    @GetMapping("/api/person/training/last")
    List<PersonTrainingDto> getPersonLastTraining(@RequestParam("id") Long idPerson){
        return fitnessFacade.getPersonLastTraining(idPerson);
    }

    @CrossOrigin
    @PostMapping("/api/person/training")
    void savePersonTraining(@RequestParam("id_person") Long idPerson, @RequestParam("id_training") Long idTraining){
        fitnessFacade.savePersonTraining(idPerson, idTraining);
    }
}
