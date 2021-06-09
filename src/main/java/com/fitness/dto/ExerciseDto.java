package com.fitness.dto;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDto {
    private Long id;
    private String title;
    private Integer time;
    private Integer reps;
    private String gif;
    private String video;
}
