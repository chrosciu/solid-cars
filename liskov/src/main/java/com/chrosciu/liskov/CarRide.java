package com.chrosciu.liskov;

public class CarRide {
    public void perform(Car car) {
        car.startEngine();
        car.reportEngineState();
        car.drive(70);
        car.drive(30);
        car.stopEngine();
        car.reportEngineState();
    }

    //TODO:
    // 1) Pass as an argument to perform() method Car derived class (TeslaCar or FuelSavingCar) instance instead of Car instance.
    // What happens ? Why ?
    // 2) Rewrite hierarchy of Car class and its children taking into account that TeslaCar and FuelSavingCar cannot inherit from Car.
    // Try to avoid code duplication as much as possible. HINT: think about abstract superclass
    // 3) Try to solve the problem without using abstract superclass. HINT: use composition instead of inheritance and delegate common functionality

}
