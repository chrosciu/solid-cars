package com.chrosciu.sid;

public class Main {
    public static void main(String[] args) {
        LiquidCheck liquidCheck = new LiquidCheck();
        WaxCarWash waxCarWash = new WaxCarWash();
        Vacuum vacuum = new Vacuum();
        //Wash wash = new Wash();
        CarCare carCare = new CarCare(waxCarWash, liquidCheck, vacuum);
        carCare.care();
    }
}
