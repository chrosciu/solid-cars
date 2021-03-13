package com.chrosciu.liskov;

import lombok.experimental.Delegate;

public class TeslaCar implements Driveable {
    @Delegate
    private final BaseDriveable baseDriveable = new BaseDriveable(this::driveWithReport);

    private void driveWithReport(int km) {
        if (Weather.getInstance().getTemperature() < 0) {
            throw new IllegalStateException("Too cold for drive !");
        }
        System.out.println("Driving with Tesla for: " + km + " km");
    }
}
