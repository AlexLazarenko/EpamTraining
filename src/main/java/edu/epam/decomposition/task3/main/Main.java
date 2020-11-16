package edu.epam.decomposition.task3.main;

import edu.epam.decomposition.task3.entity.SquareArea;
import edu.epam.decomposition.task3.report.FigureReport;
import edu.epam.decomposition.task3.service.FigureService;

//3.Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
//Во сколько раз площадь вписанного квадрата меньше площади заданного?
//
public class Main {
    public static void main(String[] args) {
        SquareArea squareArea=new SquareArea(16);
        FigureService figureService=new FigureService();
        FigureReport report=new FigureReport();
        double outerSquareSide=figureService.findOuterSquareSide(squareArea);
        double innerSquareArea=figureService.findInnerSquareArea(outerSquareSide);
        double compareSquares=figureService.compareSquares(squareArea,innerSquareArea);
        report.printInnerSquareArea(squareArea,innerSquareArea);
        report.printCompareSquares(compareSquares);
    }
}
