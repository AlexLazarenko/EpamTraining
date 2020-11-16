package edu.epam.decomposition.task7.service;

import edu.epam.decomposition.task7.entity.Point2D;

public class CoordinatesService {

    public final static Point2D POINTZERO = new Point2D(0, 0);

    public double calculateDistance(Point2D a, Point2D b) {
        return Math.sqrt((b.getX1() - a.getX1()) * (b.getX1() - a.getX1()) + (b.getY1() - a.getY1() * (b.getY1() - a.getY1())));
    }

    public String isPointCloser(Point2D a, Point2D b) {
        String answer;
        double aTo0 = calculateDistance(a, POINTZERO);
        double bTo0 = calculateDistance(b, POINTZERO);
        if (aTo0 > bTo0) {
            answer = "B is closer to 0 than A";
        } else if (aTo0 < bTo0) {
            answer = "A is closer to 0 than B";
        } else answer = "Distance from A to 0 = Distance from B to 0";
        return answer;
    }
}



