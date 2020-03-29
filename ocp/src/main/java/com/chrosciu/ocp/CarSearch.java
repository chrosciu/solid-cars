package com.chrosciu.ocp;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class CarSearch {
    private final CarRepository repository;

    public List<Car> findByCriteria(CarCriteria carCriteria) {
        return repository.getCars().stream().filter(carCriteria::matches).collect(Collectors.toList());
    }
}
