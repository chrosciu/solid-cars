package com.chrosciu.liskov;

public class Car extends BaseCar {
    protected void driveWithReport(int km) {
        System.out.println("Driving for: " + km + " km");
    }
}
