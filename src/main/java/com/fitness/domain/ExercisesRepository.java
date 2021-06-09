package com.fitness.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

interface ExercisesRepository extends Repository<Exercises, Long> {
    List<Exercises> findAllByTrainingId(Long trainingId);
}
