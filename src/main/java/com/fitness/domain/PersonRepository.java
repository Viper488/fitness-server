package com.fitness.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface PersonRepository extends JpaRepository<Person, Long>, CrudRepository<Person, Long> {
    Person findPersonById(Long idPerson);
}
