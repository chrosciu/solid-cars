package com.chrosciu.liskov;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FuelSavingCarTest {
    private FuelSavingCar fuelSavingCar;

    @Before
    public void setup() {
        fuelSavingCar = new FuelSavingCar();
    }

    @Test
    public void shouldNotBeAbleToContinuousDrive() {
        fuelSavingCar.startEngine();
        fuelSavingCar.drive(70);
        try {
            fuelSavingCar.drive(30);
            Assert.fail();
        } catch (IllegalStateException e) {
        }
    }

    @Test
    public void shouldBeAbleToDriveInWinter() {
        Weather.getInstance().setTemperature(-5);
        fuelSavingCar.startEngine();
        fuelSavingCar.drive(70);
    }
}
