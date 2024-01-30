package exercice4;

import org.example.exercice4.entity.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CityTest {
    private City city;
    @BeforeEach
    void setUp() {
        city = new City();
        city.setCityNameList(Arrays.asList("Paris", "Budapest", "Rotterdam", "Valence", "Vancouver"));
    }

//    @Test
//    void testNameCharNotRaiseExceptionWhenWordLT2(){
//        City city = new City();
//        Assertions.assertDoesNotThrow(() -> city.getCityName("az"));
//    }
//    @Test
//    void testNameEqualsOrMoreThan2Char() throws ClassNotFoundException {
//        City city = new City();
//        city.setCityNameList(Arrays.asList("Paris", "Berlin", "Londre", "Smolensk", "Oslo", "Bangkok", "Tokyo", "Madrid"));
//        List<String> result = city.getCityName("Pa");
//        Assertions.assertEquals(Arrays.asList("Paris"), result);
//    }
//    void testSearchCityShouldNotBeCaseSensitive() {
//        List<String> result = city.getCityName("vA");
//        Assertions.assertEquals(Arrays.asList("Valence", "Vancouver"), result);
//    }
//
//    @Test
//    void testSearchCityShouldReturnCitiesContainsWordSearch() {
//        List<String> result = city.getCityName("ape");
//        Assertions.assertEquals(List.of("Budapest"), result);
//    }

//    @Test
//    void testSearchCityShouldReturnAllCitiesWhenWordSearchIsAsterisk() {
//        List<String> result = city.getCityName("*");
//        Assertions.assertEquals(List.of("Paris", "Budapest", "Rotterdam", "Valence", "Vancouver"), result);
//    }


}
