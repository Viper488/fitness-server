package com.fitness.dto;

import lombok.*;

import java.util.List;

@Builder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TrainingExercisesDto {
    private Long id;
    private String title;
    private List<ExerciseDto> exercises;

}
