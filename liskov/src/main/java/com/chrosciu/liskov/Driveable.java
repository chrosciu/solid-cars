package com.chrosciu.liskov;

public interface Driveable {
    void startEngine();
    void drive(int km);
    void stopEngine();
    void reportEngineState();
}
