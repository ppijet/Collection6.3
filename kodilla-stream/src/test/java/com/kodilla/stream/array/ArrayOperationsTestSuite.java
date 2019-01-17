package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test

    public void testGetAverage(){

        //Given
        int[] numbers = new int[10];
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 13;
        numbers[3] = 23;
        numbers[4] = 14;
        numbers[5] = 4;
        numbers[6] = 19;
        numbers[7] = 71;
        numbers[8] = 9;
        numbers[9] = 56;

        //When
        double numbersAverage = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(21.6,numbersAverage,0.1);
        Assert.assertEquals(10, numbers.length);
    }
}
