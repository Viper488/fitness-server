package com.fitness.dto;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TrainingDto {
    private Long id;
    private String title;
    private String image;
}
