package exercice2;

import org.example.exercice2.entity.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibTest {
    @Test
    void testFibSeriesIsNotEmpty(){
        Fib fib = new Fib(1);
        List<Integer> result  = fib.getFibSeries();
        Assertions.assertFalse(result.isEmpty());
    }
    @Test
    void testFibSeriesContain0(){
        Fib fib = new Fib(1);
        List<Integer> result  = fib.getFibSeries();
        Assertions.assertTrue(result.contains(0));
    }

    @Test
    void testFibSeriesRange6Contain3(){
        Fib fib = new Fib(6);
        List<Integer> result  = fib.getFibSeries();
        Assertions.assertTrue(result.contains(3));
    }

    @Test
    void testFibSeriesRange6IsSize6(){
        Fib fib = new Fib(6);
        List<Integer> result  = fib.getFibSeries();
        Assertions.assertEquals(6,result.size(), "La taille n'est pas 6");
    }
@Test
    void testFibSeriesRange6No4(){
        Fib fib = new Fib(6);
        List<Integer> result  = fib.getFibSeries();
        Assertions.assertFalse(result.contains(4));
    }
@Test
    void testFibSeriesRange6Contain0One12Three5(){
    Fib fib = new Fib(6);
    List<Integer> result  = fib.getFibSeries();
    List<Integer> expectedElements = Arrays.asList(0, 1, 1, 2, 3, 5);
    Assertions.assertTrue(result.containsAll(expectedElements));
    }

//    @Test
//    void testFibSeriesRange6IsAscendante(){
//        Fib fib = new Fib(6);
//        List<Integer> result  = fib.getFibSeries();
//        for (int i = 0; i < result.size() - 1; i++){
//            Assertions.assertTrue(result.get(i) <= result.get(i+1));
//        }
//    } On évite les logique métier ici
@Test
void testFibSeriesRange6isAscendante(){
    Fib fib = new Fib(6);
    List<Integer> result  = fib.getFibSeries();
    Assertions.assertEquals(Arrays.asList(0,1,1,2,3,5),result);
}

}
