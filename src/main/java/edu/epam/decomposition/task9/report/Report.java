package edu.epam.decomposition.task9.report;

import edu.epam.decomposition.task9.entity.Circle;

public class Report {
    public void print(Circle circle) {
        System.out.println( "Area = " + circle.getS() + " Length = " + circle.getL());
    }
}
