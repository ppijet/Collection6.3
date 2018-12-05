package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite{

    private static OddNumbersExterminator oddNumbersExterminator;

    @Before
    public void before(){

        System.out.println("Test Case: BEGIN");
    }

    @After
    public void after(){

        System.out.println("Test Case: END");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(emptyList, resultList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
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
        List<Integer> evenList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");

        //Then
        Assert.assertEquals(expectedResultList, evenList);
    }
}
