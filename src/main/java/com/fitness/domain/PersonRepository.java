package com.fitness.domain;

import org.springframework.data.repository.Repository;

interface PersonRepository extends Repository<Person, Long> {
    Person findPersonById(Long idPerson);
}
