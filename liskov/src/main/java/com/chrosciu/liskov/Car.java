package com.chrosciu.liskov;

import lombok.experimental.Delegate;

public class Car implements Driveable, Nameable {
    @Delegate
    private final BaseDriveable baseDriveable = new BaseDriveable(this::driveWithReport);
    @Delegate
    private final BaseNameable baseNameable = new BaseNameable();

    private void driveWithReport(int km) {
        System.out.println("Driving for: " + km + " km");
    }
}
