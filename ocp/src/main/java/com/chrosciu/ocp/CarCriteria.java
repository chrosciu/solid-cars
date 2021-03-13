package com.chrosciu.ocp;

import java.util.function.Predicate;

@FunctionalInterface
public interface CarCriteria extends Predicate<Car> {
}
