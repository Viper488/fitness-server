package com.fitness.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

interface TrainingsRepository extends Repository<Trainings, Long> {
    List<Trainings> findAll();
    Trainings findTrainingsById(Long id);
}
