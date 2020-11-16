package edu.epam.decomposition.task9.service;

import edu.epam.decomposition.task9.entity.Circle;

import static org.testng.Assert.*;

public class ServiceTest {

    @org.testng.annotations.Test
    public void testCalculateAreaAndLength() {
        Circle circle = new Circle(3);
        Service service = new Service();
        service.calculateAreaAndLength(circle);
        Circle expected = new Circle(3, 28.274333882308138, 18.84955592153876);
        assertEquals(circle, expected);
    }
    }
