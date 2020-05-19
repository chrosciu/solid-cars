package com.chrosciu.delegate;

import lombok.experimental.Delegate;

public class Car implements Driveable {
    @Delegate
    private final BaseDriveable baseDriveable = new BaseDriveable(this::driveWithReport);

    private void driveWithReport(int km) {
        System.out.println("Driving for: " + km + " km");
    }
}
