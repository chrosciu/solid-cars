package com.chrosciu.ocp;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class CarSearch {
    private final CarRepository repository;

    public List<Car> findByName(String name) {
        return repository.getCars().stream().filter(c -> name.equals(c.getName())).collect(Collectors.toList());
    }

    public List<Car> findByMaxPrice(int price) {
        return repository.getCars().stream().filter(c -> price > c.getPrice()).collect(Collectors.toList());
    }

    //TODO:
    // 1) Rewrite this class that it will be possible to add more search methods (e.g by color, fuel usage etc.) without changing the class
    // 2) Implement test in CarSearchTest class to verify the new functionality
}
