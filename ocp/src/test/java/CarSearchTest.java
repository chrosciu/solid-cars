import com.chrosciu.ocp.Car;
import com.chrosciu.ocp.CarCriteria;
import com.chrosciu.ocp.CarRepository;
import com.chrosciu.ocp.CarSearch;
import com.chrosciu.ocp.Color;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

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
        CarCriteria carCriteria = Mockito.mock(CarCriteria.class);
        Mockito.when(carCriteria.matches(SOME_CAR)).thenReturn(true);
        Mockito.when(carCriteria.matches(SOME_OTHER_CAR)).thenReturn(false);
        //when
        List<Car> cars = carSearch.findByCriteria(carCriteria);
        //then
        Assert.assertEquals(1, cars.size());
        Assert.assertEquals(SOME_CAR, cars.get(0));
    }
}
