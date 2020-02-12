package com.chrosciu.ocp;

import lombok.Value;

@Value
public class Car {
    private String name;
    private int price;
    private Color color;
    private double fuelUsage;
}
