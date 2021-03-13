package com.chrosciu.ocp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static com.chrosciu.ocp.Color.BLACK;
import static com.chrosciu.ocp.Color.WHITE;

public class CarSearchTest {
    private static final Car SOME_CAR = new Car("Fiat Punto", 1000, BLACK, 5.5);
    private static final Car SOME_OTHER_CAR = new Car("VW Passat", 2000, WHITE, 6.5);

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
        List<Car> cars = carSearch.findByCriteria(c -> BLACK.equals(c.getColor()));
        //then
        Assert.assertEquals(1, cars.size());
        Assert.assertEquals(SOME_CAR, cars.get(0));
    }
}
