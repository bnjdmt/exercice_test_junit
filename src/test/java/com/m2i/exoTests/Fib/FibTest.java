package com.m2i.exoTests.Fib;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibTest {

    private Fib fib;

//  - Lors du déclanchement de la fonction GetFibSeries() avec un Range de 1
//  - Le résultat n’est pas vide

    @Test
    public void whenGetFibSeriesResultNotEmpty()
    {
        // Arrange
        fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.isEmpty());

    }

//  - Le résultat correspond à une liste qui contient {0}

    @Test
    public void whenGetFibSeriesResulListContain0()
    {
        // Arrange
        fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue("La série de Fibonacci doit contenir le chiffre 0", result.contains(0));
    }

//  - Lors du déclanchement de la fonction GetFibSeries() avec un Range de 6
//  - Le résultat contient le chiffre 3

    @Test
    public void whenGetFibSeriesRange_6_resultContain_3()
    {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue("La série de Fibonacci doit contenir le chiffre 3", result.contains(3));
    }

//  - Le résultat contient 6 éléments

    @Test
    public void whenGetFibSeriesRange_6_resultContain_6_elements()
    {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals("La série de Fibonacci doit contenir 6 éléments",6, result.size());
    }

//  - Le résultat n’a pas le chiffre 4 en son sein

    @Test
    public void whenGetFibSeriesRange_6_resultNotContain_4()
    {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse("La série de Fibonacci ne doit pas contenir le chiffre 4", result.contains(4));
    }

//  - Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}

    @Test
    public void whenGetFibSeriesRange_6_resultContain_0_1_1_2_3_5 ()
    {
        // Arrange
        fib = new Fib(6);
        List<Integer> expectedSeries = Arrays.asList(0, 1, 1, 2, 3, 5);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals("La série de Fibonacci doit être {0, 1, 1, 2, 3, 5}", expectedSeries, result);
    }

//  - Le résultat est trié de façon ascendance

    @Test
    public void whenGetFibSeriesRange_6_resultListIsAsc()
    {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();
        List<Integer> sortedResult = new ArrayList<>(result);
        Collections.sort(sortedResult);

        // Assert
        Assert.assertEquals(sortedResult, result);
    }
}
