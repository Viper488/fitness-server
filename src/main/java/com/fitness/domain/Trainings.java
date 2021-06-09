package com.fitness.domain;

import com.fitness.dto.TrainingsDto;
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
@Table(name = "trainings")
class Trainings {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "img")
    private String image;

    TrainingsDto dto() {
        return TrainingsDto.builder()
                .id(this.id)
                .title(this.title)
                .image(this.image)
                .build();
    }
}
