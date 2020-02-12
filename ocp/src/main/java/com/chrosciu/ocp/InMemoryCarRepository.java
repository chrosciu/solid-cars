package com.chrosciu.ocp;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class InMemoryCarRepository implements CarRepository {
    private List<Car> cars = Arrays.asList(
            new Car("Fiat Punto", 1000, Color.BLACK, 5.5),
            new Car("VW Passat", 2000, Color.WHITE, 6.5));
}
