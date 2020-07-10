package com.chrosciu.liskov;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeslaCarTest {
    private TeslaCar teslaCar;

    @Before
    public void setup() {
        teslaCar = new TeslaCar();
    }

    @Test
    public void shouldNotBeAbleToDriveInWinter() {
        Weather.getInstance().setTemperature(-5);
        teslaCar.startEngine();
        try {
            teslaCar.drive(70);
            Assert.fail();
        } catch (IllegalStateException e) {
        }
    }
}
