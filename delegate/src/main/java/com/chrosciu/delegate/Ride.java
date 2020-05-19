package com.chrosciu.delegate;

public class Ride {
    public void perform(Driveable driveable) {
        driveable.startEngine();
        driveable.reportEngineState();
        driveable.drive(70);
        driveable.drive(30);
        driveable.stopEngine();
        driveable.reportEngineState();
    }
}
