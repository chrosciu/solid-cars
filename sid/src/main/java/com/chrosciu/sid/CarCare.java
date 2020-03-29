package com.chrosciu.sid;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarCare {
    private final LiquidChecking liquidChecking;
    private final Washing washing;
    private final Vacuuming vacuuming;

    public void care() {
        liquidChecking.checkLiquids();
        washing.wash();
        vacuuming.vacuum();
    }
}
