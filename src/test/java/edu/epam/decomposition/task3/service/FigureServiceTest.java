package edu.epam.decomposition.task3.service;

import edu.epam.decomposition.task3.entity.SquareArea;

import static org.testng.Assert.*;

public class FigureServiceTest {

    @org.testng.annotations.Test
    public void testFindOuterSquareSide() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.findOuterSquareSide(squareArea);
        assertEquals(condition, 4.0, 0.0);
    }

    @org.testng.annotations.Test
    public void testFindInnerSquareArea() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.findInnerSquareArea(service.findOuterSquareSide(squareArea));
        assertEquals(condition, 8.0, 0.0);
    }

    @org.testng.annotations.Test
    public void testCompareSquares() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.compareSquares(squareArea, service.findInnerSquareArea(service.findOuterSquareSide(squareArea)));
        assertEquals(condition, 2.0, 0.0);
    }
}