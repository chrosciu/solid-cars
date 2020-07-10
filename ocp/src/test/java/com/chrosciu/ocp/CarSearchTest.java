package com.chrosciu.ocp;

import com.chrosciu.ocp.Car;
import com.chrosciu.ocp.CarRepository;
import com.chrosciu.ocp.CarSearch;
import com.chrosciu.ocp.Color;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class CarSearchTest {
    private static final Car SOME_CAR = new Car("Fiat Punto", 1000, Color.BLACK, 5.5);
    private static final Car SOME_OTHER_CAR = new Car("VW Passat", 2000, Color.WHITE, 6.5);

    private CarRepository carRepository;
    private CarSearch carSearch;

    @Before
    public void setup() {
        carRepository = Mockito.mock(CarRepository.class);
        carSearch = new CarSearch(carRepository);
    }

    @Test
    public void shouldSearchCarAccordingToGivenCriteria() {
        //given
        Mockito.when(carRepository.getCars()).thenReturn(Arrays.asList(SOME_CAR, SOME_OTHER_CAR));
        //when
        //TODO: Implement test
    }
}
