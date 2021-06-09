package com.fitness.dto;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PersonExercisesDto {
    private Long idPerson;
    private Long idTraining;
    private String titleTraining;
    private Integer day;
    private Integer month;
    private Integer year;
}
