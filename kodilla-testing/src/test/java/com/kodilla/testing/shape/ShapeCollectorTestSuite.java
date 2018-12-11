package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass

    public static void beforeAllTests(){

        System.out.println("This is the begining of tests. ");
    }

    @AfterClass

    public static void afterAllTests(){

        System.out.println("All test are finished.");
    }

    @Before

    public void beforeEveryTest(){

        testCounter++;
        System.out.println("Preparing to execute test #"+ testCounter);
    }

    @After

    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " finished.");
    }

    @Test

    public void testAddFigure(){

        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shapeCircle = new Circle(5);
        Shape shapeSquare = new Square(3);
        Shape shapeTriangle = new Triangle(4,8);

        //When
        collector.addFigure(shapeCircle);
        collector.addFigure(shapeSquare);
        collector.addFigure(shapeTriangle);

        //Then
        Assert.assertEquals(shapeCircle, collector.getFigure(0));
        Assert.assertEquals(3, collector.showFigures().size());
    }

    @Test

    public void testRemoveFigure() {

        //Given
        ShapeCollector collector = new ShapeCollector();

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5,6.5);
        Square square = new Square(4);

        collector.addFigure(circle);
        collector.addFigure(triangle);
        collector.addFigure(square);

        //When
        boolean removed = collector.removeFigure(circle);

        //Then
        Assert.assertTrue(removed);
        Assert.assertEquals(2, collector.showFigures().size());
    }

    @Test

    public void testGetFigure(){

        //Given
        ShapeCollector collector = new ShapeCollector();

        Square square = new Square(6);
        Triangle triangle = new Triangle(2,3);
        Circle circle = new Circle(2.5);

        collector.addFigure(square);
        collector.addFigure(triangle);
        collector.addFigure(circle);

        //When
        Shape acquiredFigure = collector.getFigure(1);

        //Then
        Assert.assertEquals(triangle, acquiredFigure);
    }

    @Test

    public void testShowFigures(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(2.4));
        shapeCollector.addFigure(new Square(3));
        shapeCollector.addFigure(new Triangle(2,4.4));

        //Whwn
        ArrayList<Shape> addFigures = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(3,addFigures.size());
    }
}
