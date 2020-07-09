package com.chrosciu.liskov;

import lombok.experimental.Delegate;

public class FuelSavingCar implements Driveable {
    @Delegate
    private final BaseDriveable baseDriveable = new BaseDriveable(this::driveWithReport);

    private void driveWithReport(int km) {
        System.out.println("Driving with fuel saving for: " + km + " km");
        baseDriveable.stopEngine();
    }
}
