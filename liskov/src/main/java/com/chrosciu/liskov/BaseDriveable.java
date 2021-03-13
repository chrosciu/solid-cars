package com.chrosciu.liskov;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BaseDriveable implements Driveable {
    private final DrivingStrategy drivingStrategy;
    protected boolean engineStarted = false;

    public void startEngine() {
        System.out.println("Starting engine");
        engineStarted = true;
    }

    public void drive(int km) {
        checkIfEngineStarted();
        drivingStrategy.driveWithReport(km);
    }

    public void stopEngine() {
        System.out.println("Stopping engine");
        engineStarted = false;
    }

    public void reportEngineState() {
        System.out.println("Engine is " + (engineStarted ? "started" : "stopped"));
    }

    private void checkIfEngineStarted() {
        if (!engineStarted) {
            throw new IllegalStateException("Cannot drive without started engine!");
        }
    }
}
