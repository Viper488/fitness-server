package com.fitness.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

interface PersonRepository extends Repository<Person, Long>, CrudRepository<Person, Long> {
    Person findPersonById(Long idPerson);
}
