package com.chrosciu.delegate;

import com.chrosciu.weather.Weather;

public class Main {
    public static void main(String[] args) {
        Weather.getInstance().setTemperature(-5);
        Ride ride = new Ride();
        Driveable driveable = new Car();
        ride.perform(driveable);
    }
}
