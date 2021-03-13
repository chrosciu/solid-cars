package com.chrosciu.liskov;

@FunctionalInterface
public interface DrivingStrategy {
    void driveWithReport(int km);
}
