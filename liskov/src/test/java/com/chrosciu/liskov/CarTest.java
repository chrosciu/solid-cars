package com.chrosciu.liskov;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private Car car;

    @Before
    public void setup() {
        car = new Car();
    }

    @Test
    public void shouldBeAbleToContinuousDrive() {
        car.startEngine();
        car.drive(70);
        car.drive(30);
    }

    @Test
    public void shouldBeAbleToDriveInWinter() {
        Weather.getInstance().setTemperature(-5);
        car.startEngine();
        car.drive(70);
    }
}
