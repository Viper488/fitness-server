package com.fitness.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class FitnessConfiguration {
    @Bean
    FitnessFacade fitnessFacade(PersonRepository personRepository,
                                PersonTrainingRepository personTrainingRepository,
                                TrainingRepository trainingsRepository,
                                ExercisesRepository exercisesRepository) {
        return new FitnessFacade(
                personRepository,
                personTrainingRepository,
                trainingsRepository,
                exercisesRepository
        );
    }
}
