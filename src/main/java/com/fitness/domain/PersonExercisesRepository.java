package com.fitness.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

interface PersonExercisesRepository  extends Repository<PersonExercises, Long>, CrudRepository<PersonExercises, Long> {
    List<PersonExercises> findAllByIdPerson(Long idPerson);
}
