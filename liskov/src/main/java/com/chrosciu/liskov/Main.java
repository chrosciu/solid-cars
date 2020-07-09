package com.chrosciu.liskov;

public class Main {
    public static void main(String[] args) {
        Weather.getInstance().setTemperature(-5);
        CarRide carRide = new CarRide();
        Driveable driveable = new Car();
        carRide.perform(driveable);
    }
}
