package com.chrosciu.guice;

public class CarCare {
    private ComprehensiveCarCareCenter careCenter = new ComprehensiveCarCareCenter();

    public void care() {
        careCenter.checkLiquids();
        careCenter.wash();
        careCenter.vacuum();
    }
}
