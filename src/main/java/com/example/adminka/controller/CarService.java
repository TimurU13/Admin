package com.example.adminka.controller;

import com.example.adminka.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> allCars = Arrays.asList(
            new Car(1L, "BMW", 299999.99),
            new Car(3L, "MERC", 399999.99)
    );

    public List<Car> getAllCars() {
        return allCars;
    }

    public List<Car> getCarsByIds(List<Long> carIds) {
        return allCars.stream()
                .filter(car -> carIds.contains(car.getId()))
                .collect(Collectors.toList());
    }
}
