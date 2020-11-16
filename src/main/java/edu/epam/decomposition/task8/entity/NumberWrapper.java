package edu.epam.decomposition.task8.entity;

public class NumberWrapper {
    private double number;

    public NumberWrapper(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyNumberEntity{" +
                "number=" + number +
                '}';
    }
}
