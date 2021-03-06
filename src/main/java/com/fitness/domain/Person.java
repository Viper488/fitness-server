package com.fitness.domain;

import com.fitness.dto.PersonDto;
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
@Table(name = "person")
class Person {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "height")
    private double height;
    @Column(name = "weight")
    private double weight;

    PersonDto dto() {
        return PersonDto.builder()
                .id(this.id)
                .name(this.name)
                .password(this.password)
                .height(this.height)
                .weight(this.weight)
                .build();
    }
}
