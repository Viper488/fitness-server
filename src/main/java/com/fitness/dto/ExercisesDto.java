package com.fitness.dto;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ExercisesDto {
    private Long exerciseId;
    private Long trainingId;
    private String title;
    private Integer time;
    private Integer reps;
    private String gif;
    private String video;
}
