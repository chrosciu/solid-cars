package com.chrosciu.sid;

public class LiquidCheck implements LiquidChecking {
    @Override
    public void checkLiquids() {
        checkOil();
        checkWindscreenWasher();
        checkBrakeFluid();
        checkCoolant();
    }

    private void checkOil() {
        System.out.println("Checking oil");
    }

    private void checkWindscreenWasher() {
        System.out.println("Checking windscreen washer");
    }

    private void checkBrakeFluid() {
        System.out.println("Checking brake fluid");
    }

    private void checkCoolant() {
        System.out.println("Checking coolant");
    }
}
