package com.chrosciu.sid;

public class Main {
    public static void main(String[] args) {
        ComprehensiveCarCareCenter careCenter = new ComprehensiveCarCareCenter();
        CarCare carCare = new CarCare(careCenter);
        carCare.care();
    }
}
