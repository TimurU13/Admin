package com.example.adminka.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Car {
    private Long id;
    private String name;
    private Double price;

    public Car(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
