package com.chrosciu.sid;

import javax.inject.Inject;

public class CarCare {
    private final LiquidChecking liquidChecking;
    private final Washing washing;
    private final Vacuuming vacuuming;

    @Inject
    public CarCare(LiquidChecking liquidChecking, Washing washing, Vacuuming vacuuming) {
        this.liquidChecking = liquidChecking;
        this.washing = washing;
        this.vacuuming = vacuuming;
    }

    public void care() {
        liquidChecking.checkLiquids();
        washing.wash();
        vacuuming.vacuum();
    }
}
