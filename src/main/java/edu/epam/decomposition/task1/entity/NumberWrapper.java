package edu.epam.decomposition.task1.entity;

public class NumberWrapper {
    private int number;

    public NumberWrapper(int number) {
        this.number = number;
    }

    public int getMyNumber() {
        return number;
    }

    public void setMyNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
