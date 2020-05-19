package com.chrosciu.liskov;

public abstract class BaseCar {
    protected boolean engineStarted = false;

    public void startEngine() {
        System.out.println("Starting engine");
        engineStarted = true;
    }

    public void drive(int km) {
        checkIfEngineStarted();
        driveWithReport(km);
    }

    public void stopEngine() {
        System.out.println("Stopping engine");
        engineStarted = false;
    }

    public void reportEngineState() {
        System.out.println("Engine is " + (engineStarted ? "started" : "stopped"));
    }

    protected abstract void driveWithReport(int km);

    private void checkIfEngineStarted() {
        if (!engineStarted) {
            throw new IllegalStateException("Cannot drive without started engine!");
        }
    }
}
