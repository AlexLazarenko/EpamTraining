package edu.epam.decomposition.task7.service;

import edu.epam.decomposition.task7.entity.Point2D;

import static org.testng.Assert.assertEquals;

public class CoordinatesServiceTest {


    @org.testng.annotations.Test
    public void testIsPointCloser() {
        Point2D a = new Point2D(1, 1);
        Point2D b = new Point2D(1, 2);
        CoordinatesService service = new CoordinatesService();
        String actual = service.isPointCloser(a, b);
        assertEquals(actual, "A is closer to 0 than B");
    }
}