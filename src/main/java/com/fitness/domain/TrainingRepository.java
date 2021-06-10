package com.fitness.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

interface TrainingRepository extends Repository<Training, Long> {
    List<Training> findAll();
    Training findTrainingById(Long id);
}
