package edu.epam.decomposition.task6.entity;

public class Time {
    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Time{" +
                "seconds=" + seconds +
                '}';
    }
}
