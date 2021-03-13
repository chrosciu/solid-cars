package com.chrosciu.sid;

public class Main {
    public static void main(String[] args) {
        ComprehensiveCarCareCenter careCenter = new ComprehensiveCarCareCenter();
        WaxCarWash waxCarWash = new WaxCarWash();
        CarCare carCare = new CarCare(waxCarWash, careCenter, careCenter);
        carCare.care();
    }
}
