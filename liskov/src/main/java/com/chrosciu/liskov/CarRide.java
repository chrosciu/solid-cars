package com.chrosciu.liskov;

public class CarRide {
    public void perform(Driveable driveable) {
        driveable.startEngine();
        driveable.reportEngineState();
        driveable.drive(70);
        driveable.drive(30);
        driveable.stopEngine();
        driveable.reportEngineState();
    }

    //TODO:
    // 1) Pass as an argument to perform() method Car derived class (TeslaCar or FuelSavingCar) instance instead of Car instance.
    // What happens ? Why ?
    // 2) Rewrite hierarchy of Car class and its children taking into account that TeslaCar and FuelSavingCar cannot inherit from Car.
    // Try to avoid code duplication as much as possible.
    // Hint - extract common part of functionality to abstract class
}
