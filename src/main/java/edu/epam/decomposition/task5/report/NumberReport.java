package edu.epam.decomposition.task5.report;

import edu.epam.decomposition.task5.entity.NumberWrapper;

public class NumberReport {
    public void print(NumberWrapper number,boolean isPerfect) {

        System.out.println("Number "+number.getMyNumber()+" is perfect ="+isPerfect);
    }
}
