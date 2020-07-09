package com.chrosciu.liskov;

import lombok.experimental.Delegate;

public class FuelSavingCar implements Driveable {
    private final BaseDriveable baseDriveable = new BaseDriveable(this::driveWithReport);

    @Override
    public void startEngine() {
        baseDriveable.startEngine();
    }

    @Override
    public void drive(int km) {
        baseDriveable.drive(km);
    }

    @Override
    public void stopEngine() {
        baseDriveable.stopEngine();
    }

    @Override
    public void reportEngineState() {
        baseDriveable.reportEngineState();
    }

    private void driveWithReport(int km) {
        System.out.println("Driving with fuel saving for: " + km + " km");
        baseDriveable.stopEngine();
    }
}
