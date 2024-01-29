package exercice3;

import org.example.exercice3.entity.Year;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearTest {



    @Test
    void testIsLeapYear() {
        Year year = new Year();
        Assertions.assertTrue(year.isLeapYear(2024));
    }
    @Test
    void testLeapOkWhenYear2000(){
        Year year = new Year();
        Assertions.assertTrue(year.isLeapYear(2000));
    }

    @Test
    void LeapShouldBeFalseWhen2021(){
        Year year = new Year();
        Assertions.assertFalse(year.isLeapYear(2021));
    }
}
