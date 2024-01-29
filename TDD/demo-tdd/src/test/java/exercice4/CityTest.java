package exercice4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CityTest {

    @Test
    void testNameCharNotLessThen2(){
        City city = new City();
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
        city.getCityName("Lille");
        });
    }
    @Test
    void testNameEqualsOrMoreThan2Char(){
        City city = new City();
        List<String> cities = city.getCityName("pa");
        Assertions.assertFalse(cities.isEmpty());
    }

}
