package edu.epam.decomposition.task3.report;

import edu.epam.decomposition.task3.entity.SquareArea;

public class FigureReport {
    public void printInnerSquareArea(SquareArea squareArea,double innerSquareArea){
        System.out.println("Inner Square Area ="+innerSquareArea);
    }
    public void printCompareSquares(double number){
        System.out.println("Inner Square smaller than Outer Square in "+number+" times");
    }
}
