package com.chrosciu.liskov;

public class TeslaCar extends Car {
    @Override
    protected void driveWithReport(int km) {
        if (Weather.getInstance().getTemperature() < 0) {
            throw new IllegalStateException("Too cold for drive !");
        }
        System.out.println("Driving with Tesla for: " + km + " km");
    }
}
