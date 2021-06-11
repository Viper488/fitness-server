package com.fitness.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

interface PersonTrainingRepository extends JpaRepository<PersonTraining, Long> {
    List<PersonTraining> findAllByIdPerson(Long idPerson);

    @Query(value = "SELECT * FROM person_training WHERE id_person = ?1 ORDER BY year DESC, month DESC, day DESC", nativeQuery = true)
    List<PersonTraining> findPersonLastTraining(Long personId);
}
