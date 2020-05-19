package com.chrosciu.liskov;

public class Car extends BaseCar {
    @Override
    protected void driveWithReport(int km) {
        System.out.println("Driving for: " + km + " km");
    }
}
