package com.chrosciu.delegate;

public class CarRide {
    public void perform(Car car) {
        car.startEngine();
        car.reportEngineState();
        car.drive(70);
        car.drive(30);
        car.stopEngine();
        car.reportEngineState();
    }
}
