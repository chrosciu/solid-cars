package com.chrosciu.sid;

public class CarCare {
    private ComprehensiveCarCareCenter careCenter = new ComprehensiveCarCareCenter();

    //TODO:
    // 1) Do not create careCenter object here, but inject it as a dependency (injection can be done in Main class)
    // 2) Uncomment test in CarCareTest class to verify that appropriate methods from careCenter are being called
    // 3) Use interface containing all care methods instead of concrete implementation
    // 4) Split interface mentioned in step 3) to multiple interfaces - each responsible for one operation
    // 5) Split ComprehensiveCarCareCenter into smaller classes - each responsible for single functionality
    // 6) Use WaxCarWash for washing the car instead of one of classes created in step 5)
    // 7) Adjust test from 2) accordingly to changes in 3) - 5)

    public void care() {
        careCenter.checkLiquids();
        careCenter.wash();
        careCenter.vacuum();
    }
}
