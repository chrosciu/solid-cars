package com.chrosciu.delegate;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class BaseDriveable implements Driveable {
    @NonNull
    private final DrivingStrategy drivingStrategy;
    private boolean engineStarted = false;

    @Override
    public void startEngine() {
        System.out.println("Starting engine");
        engineStarted = true;
    }

    @Override
    public void drive(int km) {
        checkIfEngineStarted();
        drivingStrategy.driveWithReport(km);
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");
        engineStarted = false;
    }

    @Override
    public void reportEngineState() {
        System.out.println("Engine is " + (engineStarted ? "started" : "stopped"));
    }

    private void checkIfEngineStarted() {
        if (!engineStarted) {
            throw new IllegalStateException("Cannot drive without started engine!");
        }
    }
}
