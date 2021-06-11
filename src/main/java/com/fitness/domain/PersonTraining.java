package com.fitness.domain;

import com.fitness.dto.PersonTrainingDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "person_training")
class PersonTraining {

    @Id
    @Column(name = "id_training")
    private Long idTraining;
    @Column(name = "id_person")
    private Long idPerson;
    @Column(name = "title_training")
    private String titleTraining;
    @Column(name = "day")
    private Integer day;
    @Column(name = "month")
    private Integer month;
    @Column(name = "year")
    private Integer year;

    PersonTrainingDto dto() {
        return PersonTrainingDto.builder()
                .idPerson(this.idPerson)
                .idTraining(this.idTraining)
                .titleTraining(this.titleTraining)
                .day(this.day)
                .month(this.month)
                .year(this.year)
                .build();
    }
}
