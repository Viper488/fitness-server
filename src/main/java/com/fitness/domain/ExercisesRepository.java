package com.fitness.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface ExercisesRepository extends JpaRepository<Exercises, Long> {
    List<Exercises> findAllByTrainingId(Long trainingId);
}
