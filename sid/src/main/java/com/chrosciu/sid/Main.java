package com.chrosciu.sid;

public class Main {
    public static void main(String[] args) {
        LiquidChecking liquidChecking = new LiquidCheck();
        Washing washing = new VaxCarWash();
        Vacuuming vacuuming = new Vacuum();
        CarCare carCare = new CarCare(liquidChecking, washing, vacuuming);
        carCare.care();
    }
}
