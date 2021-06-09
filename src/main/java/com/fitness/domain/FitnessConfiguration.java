package com.fitness.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class FitnessConfiguration {
    @Bean
    FitnessFacade fitnessFacade(PersonRepository personRepository,
                                PersonExercisesRepository personExercisesRepository,
                                TrainingsRepository trainingsRepository,
                                ExercisesRepository exercisesRepository) {
        return new FitnessFacade(
                personRepository,
                personExercisesRepository,
                trainingsRepository,
                exercisesRepository
        );
    }
}
