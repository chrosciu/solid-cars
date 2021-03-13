package com.chrosciu.sid;

import org.junit.Test;
import org.mockito.Mockito;

public class CarCareTest {

    private CarCaring carCaring = Mockito.mock(CarCaring.class);

    private CarCare carCare = new CarCare(carCaring);

    @Test
    public void shouldCheckLiquidWashAndVacuum() {
        //when
        carCare.care();
        //then
        Mockito.verify(carCaring).wash();
        Mockito.verify(carCaring).checkLiquids();
        Mockito.verify(carCaring).vacuum();
    }

}
