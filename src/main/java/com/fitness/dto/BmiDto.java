package com.fitness.dto;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BmiDto {
    private Long id;
    private Long idPerson;
    private double bmi;
    private Integer day;
    private Integer month;
    private Integer year;
}
