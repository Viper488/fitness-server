package com.fitness.domain;

import com.fitness.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional
public class FitnessFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(FitnessFacade.class);

    private final PersonRepository personRepository;
    private final PersonTrainingRepository personTrainingRepository;
    private final TrainingRepository trainingRepository;
    private final ExercisesRepository exercisesRepository;

    FitnessFacade(PersonRepository personRepository,
                  PersonTrainingRepository personTrainingRepository,
                  TrainingRepository trainingRepository,
                  ExercisesRepository exercisesRepository) {
        this.personRepository = personRepository;
        this.personTrainingRepository = personTrainingRepository;
        this.trainingRepository = trainingRepository;
        this.exercisesRepository = exercisesRepository;
    }

    public List<TrainingDto> getTrainings(){
        return trainingRepository.findAll().stream().map(Training::dto).collect(Collectors.toList());
    }

    public TrainingExercisesDto getExercises(Long idTraining){
        List<ExercisesDto> exercises = exercisesRepository.findAllByTrainingId(idTraining).stream().map(Exercises::dto).collect(Collectors.toList());
        TrainingDto trainingDto = trainingRepository.findTrainingById(idTraining).dto();
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
                .id(trainingDto.getId())
                .title(trainingDto.getTitle())
                .exercises(exercise)
                .build();
    }

    public double calculateBmi(double height, double weight) {
        return weight / Math.pow(height/100,2);
    }

    public List<PersonTrainingDto> getPersonTrainings(Long personId){
        return personTrainingRepository.findAllByIdPerson(personId).stream().map(PersonTraining::dto).collect(Collectors.toList());
    }

    public List<PersonTrainingDto> getPersonLastTraining(Long personId){

        return personTrainingRepository.findPersonLastTraining(personId)
                .stream()
                .map(PersonTraining::dto)
                .collect(Collectors.toList());
    }

    public void savePersonTraining(Long idPerson, Long idTraining){
        TrainingDto trainingDto = trainingRepository.findTrainingById(idTraining).dto();
        LocalDateTime now = LocalDateTime.now();
        PersonTraining personTrainingDto = new PersonTraining(idPerson, idTraining, trainingDto.getTitle(), now.getDayOfMonth(), now.getMonthValue() + 1, now.getYear());
        personTrainingRepository.save(personTrainingDto);
    }
}
