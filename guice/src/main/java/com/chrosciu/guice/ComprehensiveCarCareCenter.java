package com.chrosciu.guice;

public class ComprehensiveCarCareCenter {
    public void wash() {
        washBody();
        washWindows();
    }

    private void washBody() {
        System.out.println("Washing body");
    }

    private void washWindows() {
        System.out.println("Washing windows");
    }

    public void checkLiquids() {
        checkOil();
        checkWindscreenWasher();
        checkBrakeFluid();
        //TODO: Add coolant check
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

    public void vacuum() {
        vacuumDashboard();
        vacuumSeats();
    }

    private void vacuumDashboard() {
        System.out.println("Vacuuming dashboard");
    }

    private void vacuumSeats() {
        System.out.println("Vacuuming seats");
    }
}
