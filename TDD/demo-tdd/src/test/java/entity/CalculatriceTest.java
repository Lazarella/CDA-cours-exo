package entity;

import org.example.entity.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    @Test
    void testAddition(){
        //Arrange
        Calculatrice calculatrice= new Calculatrice();
        //Act
        double result = calculatrice.addition(10,45);
        //Assertion
        Assertions.assertEquals(55, result);
    }
    @Test
    void testDivision1(){
        //Arrange
        Calculatrice calculatrice= new Calculatrice();
        //Act and assert
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            calculatrice.division(10, 0);
        });
    }
    @Test
    void testDivision2(){
        //Arrange
        Calculatrice calculatrice= new Calculatrice();
        //Act
        double result = calculatrice.division(100,10);
        //Assertion
        Assertions.assertEquals(10, result);
    }
}
