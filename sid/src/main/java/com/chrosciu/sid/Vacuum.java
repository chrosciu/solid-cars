package com.chrosciu.sid;

public class Vacuum implements Vacuuming {
    @Override
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
