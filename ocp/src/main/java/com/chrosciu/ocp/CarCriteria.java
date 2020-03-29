package com.chrosciu.ocp;

@FunctionalInterface
public interface CarCriteria {
    boolean matches(Car car);
}
