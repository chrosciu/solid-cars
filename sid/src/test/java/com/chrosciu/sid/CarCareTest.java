package com.chrosciu.sid;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CarCareTest {
    private LiquidChecking liquidChecking;
    private Washing washing;
    private Vacuuming vacuuming;
    private CarCare carCare;

    @Before
    public void setup() {
        liquidChecking = Mockito.mock(LiquidChecking.class);
        washing = Mockito.mock(Washing.class);
        vacuuming = Mockito.mock(Vacuuming.class);
        carCare = new CarCare(liquidChecking, washing, vacuuming);
    }

    @Test
    public void shouldCheckLiquidWashAndVacuum() {
        //when
        carCare.care();
        //then
        Mockito.verify(liquidChecking).checkLiquids();
        Mockito.verify(washing).wash();
        Mockito.verify(vacuuming).vacuum();
    }
}
