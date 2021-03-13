package com.chrosciu.ocp;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class CarSearch {
    private final CarRepository repository;

    public List<Car> findByCriteria(CarCriteria carCriteria) {
        return repository.getCars().stream().filter(carCriteria::test).collect(Collectors.toList());
    }


    //TODO:
    // 1) Rewrite this class that it will be possible to add more search methods (e.g by color, fuel usage etc.) without changing the class
    // 2) Implement test in CarSearchTest class to verify the new functionality
}
