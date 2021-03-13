package com.chrosciu.sid;

import org.junit.Test;
import org.mockito.Mockito;

public class CarCareTest {

    private Washing washing = Mockito.mock(Washing.class);
    private LiquidChecking liquidChecking = Mockito.mock(LiquidChecking.class);
    private Vacuuming vacuuming = Mockito.mock(Vacuuming.class);

    private CarCare carCare = new CarCare(washing, liquidChecking, vacuuming);

    @Test
    public void shouldCheckLiquidWashAndVacuum() {
        //when
        carCare.care();
        //then
        Mockito.verify(washing).wash();
        Mockito.verify(liquidChecking).checkLiquids();
        Mockito.verify(vacuuming).vacuum();
    }

}
