package com.chrosciu.guice;

import javax.inject.Inject;

public class CarCare {
    @Inject
    private LiquidChecking liquidChecking;
    @Inject
    private Washing washing;
    @Inject
    private Vacuuming vacuuming;

    public void care() {
        liquidChecking.checkLiquids();
        washing.wash();
        vacuuming.vacuum();
    }

}
