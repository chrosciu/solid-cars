package com.chrosciu.delegate;

public interface Driveable {
    void startEngine();
    void drive(int km);
    void stopEngine();
    void reportEngineState();
}
