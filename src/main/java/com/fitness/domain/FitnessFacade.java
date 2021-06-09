package com.fitness.domain;

import com.fitness.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
public class FitnessFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(FitnessFacade.class);

    private final PersonRepository personRepository;
    private final PersonExercisesRepository personExercisesRepository;
    private final TrainingsRepository trainingsRepository;
    private final ExercisesRepository exercisesRepository;

    FitnessFacade(PersonRepository personRepository,
                  PersonExercisesRepository personExercisesRepository,
                  TrainingsRepository trainingsRepository,
                  ExercisesRepository exercisesRepository) {
        this.personRepository = personRepository;
        this.personExercisesRepository = personExercisesRepository;
        this.trainingsRepository = trainingsRepository;
        this.exercisesRepository = exercisesRepository;
    }

    public List<TrainingsDto> getTrainings(){
        return trainingsRepository.findAll().stream().map(Trainings::dto).collect(Collectors.toList());
    }

    public TrainingExercisesDto getExercises(Long idTraining){
        List<ExercisesDto> exercises = exercisesRepository.findAllByTrainingId(idTraining).stream().map(Exercises::dto).collect(Collectors.toList());
        TrainingsDto trainingsDto = trainingsRepository.findTrainingsById(idTraining).dto();
        List<ExerciseDto> exercise = exercises.stream()
                .map(exercisesDto -> ExerciseDto.builder()
                        .id(exercisesDto.getExerciseId())
                        .title(exercisesDto.getTitle())
                        .time(exercisesDto.getTime())
                        .reps(exercisesDto.getReps())
                        .gif(exercisesDto.getGif())
                        .video(exercisesDto.getVideo())
                        .build())
                .collect(Collectors.toList());


        return TrainingExercisesDto.builder()
                .id(trainingsDto.getId())
                .title(trainingsDto.getTitle())
                .exercises(exercise)
                .build();
    }

    public double calculateBmi(double height, double weight) {
        return weight / Math.pow(height/100,2);
    }
}
