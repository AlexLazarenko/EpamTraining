package edu.epam.decomposition.task9.service;

import edu.epam.decomposition.task9.entity.Circle;

public class Service {
    public static final double PI = Math.PI;
    public void calculateAreaAndLength(Circle circle) {
        circle.setS(PI * circle.getR() * circle.getR());
        circle.setL(2 * PI * circle.getR());
    }

}
