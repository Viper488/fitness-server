package com.fitness.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

interface PersonExercisesRepository  extends Repository<PersonExercises, Long> {
    List<PersonExercises> findAllByIdPerson(Long idPerson);
}
