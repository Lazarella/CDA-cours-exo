package entity;

import org.example.entity.Tools;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class ClassTest {
    @Test
    void testIfNumberIsEven() {
Tools tools = new Tools();
boolean res = tools.isEven(2);
//assertTrue(res);
    }
}
