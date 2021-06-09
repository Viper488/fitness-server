package com.fitness.domain;

import com.fitness.dto.ExercisesDto;
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
@Table(name = "exercises")
class Exercises {
    @Id
    @Column(name = "id_exercise")
    private Long exerciseId;
    @Column(name = "id_training")
    private Long trainingId;
    @Column(name = "title")
    private String title;
    @Column(name = "time")
    private Integer time;
    @Column(name = "reps")
    private Integer reps;
    @Column(name = "gif")
    private String gif;
    @Column(name = "video")
    private String video;

    ExercisesDto dto() {
        return ExercisesDto.builder()
                .exerciseId(this.exerciseId)
                .trainingId(this.trainingId)
                .title(this.title)
                .time(this.time)
                .reps(this.reps)
                .gif(this.gif)
                .video(this.video)
                .build();
    }
}
