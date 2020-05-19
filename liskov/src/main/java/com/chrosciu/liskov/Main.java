package com.chrosciu.liskov;

import com.chrosciu.weather.Weather;

public class Main {
    public static void main(String[] args) {
        Weather.getInstance().setTemperature(-5);
        CarRide carRide = new CarRide();
        BaseCar car = new Car();
        carRide.perform(car);
    }
}
