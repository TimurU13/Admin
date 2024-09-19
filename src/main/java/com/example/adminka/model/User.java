package com.example.adminka.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private List<Car> cars;

    public User(long id, String name, String email, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cars = cars;
    }
}
