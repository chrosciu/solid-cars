package com.chrosciu.liskov;

import lombok.experimental.Delegate;

public class TeslaCar implements Driveable {
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
        if (Weather.getInstance().getTemperature() < 0) {
            throw new IllegalStateException("Too cold for drive !");
        }
        System.out.println("Driving with Tesla for: " + km + " km");
    }
}
