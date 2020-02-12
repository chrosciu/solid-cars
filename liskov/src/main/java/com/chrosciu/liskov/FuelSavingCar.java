package com.chrosciu.liskov;

public class FuelSavingCar extends Car {
    @Override
    protected void driveWithReport(int km) {
        System.out.println("Driving with fuel saving for: " + km + " km");
        engineStarted = false;
    }
}
