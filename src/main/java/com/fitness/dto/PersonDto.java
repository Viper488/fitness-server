package com.fitness.dto;

import lombok.*;

import javax.persistence.Column;

@Builder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    private Long id;
    private String name;
    private String password;
    private double height;
    private double weight;
}
