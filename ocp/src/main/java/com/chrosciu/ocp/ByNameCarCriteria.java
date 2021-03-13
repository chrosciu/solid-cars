package com.chrosciu.ocp;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ByNameCarCriteria implements CarCriteria {
    @NonNull
    private final String name;

    @Override
    public boolean test(Car car) {
        return name.equals(car.getName());
    }
}
