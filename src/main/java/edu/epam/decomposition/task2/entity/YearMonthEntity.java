package edu.epam.decomposition.task2.entity;

public class YearMonthEntity {
    private int year;
    private int month;

    public YearMonthEntity(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "YearMonthEntity{" +
                "year=" + year +
                ", month=" + month +
                '}';
    }
}
