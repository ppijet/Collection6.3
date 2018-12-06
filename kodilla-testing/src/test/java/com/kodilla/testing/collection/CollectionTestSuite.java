package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {


    @Before
    public void before(){

        System.out.println("Test Case: BEGIN");
    }

    @After
    public void after(){

        System.out.println("Test Case: END");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {


        //Given
        OddNumbersExterminator numbersChecking = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = numbersChecking.exterminate(emptyList);
        System.out.println("Testing >>EMPTY LIST<<");
        //Then
        Assert.assertEquals(0, resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator evenSort = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            normalList.add(i);
        }

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(0);
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(6);
        expectedResultList.add(8);

        //When
        List<Integer> evenList = evenSort.exterminate(normalList);
        System.out.println("Testing >>NORMAL LIST<<");

        //Then
        Assert.assertEquals(expectedResultList, evenList);
        Assert.assertEquals(5, evenList.size());
    }
}
