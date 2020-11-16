package edu.epam.decomposition.task3.entity;

public class SquareArea {
    private double squareArea;

    public SquareArea(double squareArea) {
        this.squareArea = squareArea;
    }

    public double getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
    }

    @Override
    public String toString() {
        return "SquareArea{" +
                "squareArea=" + squareArea +
                '}';
    }
}
