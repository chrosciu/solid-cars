package com.chrosciu.sid;

import org.junit.Test;
import org.mockito.Mockito;

public class CarCareTest {

    private ComprehensiveCarCareCenter careCenter = Mockito.mock(ComprehensiveCarCareCenter.class);

    private CarCare carCare = new CarCare(careCenter);

    @Test
    public void shouldCheckLiquidWashAndVacuum() {
        //when
        carCare.care();
        //then
        Mockito.verify(careCenter).wash();
        Mockito.verify(careCenter).checkLiquids();
        Mockito.verify(careCenter).vacuum();
    }

}
