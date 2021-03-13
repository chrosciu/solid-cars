package com.chrosciu.liskov;

public class Main {
    public static void main(String[] args) {
        Weather.getInstance().setTemperature(-5);
        CarRide carRide = new CarRide();
        TeslaCar car = new TeslaCar(); //new Car();
        carRide.perform(car);
    }
}
