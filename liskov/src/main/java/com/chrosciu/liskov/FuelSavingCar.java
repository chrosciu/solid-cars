package com.chrosciu.liskov;

public class FuelSavingCar extends BaseCar {
    @Override
    protected void driveWithReport(int km) {
        System.out.println("Driving with fuel saving for: " + km + " km");
        engineStarted = false;
    }
}
