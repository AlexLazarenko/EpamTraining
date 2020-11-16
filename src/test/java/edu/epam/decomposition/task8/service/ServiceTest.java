package edu.epam.decomposition.task8.service;

import edu.epam.decomposition.task8.entity.NumberWrapper;

import static org.testng.Assert.*;

public class ServiceTest {

    @org.testng.annotations.Test
    public void testCalculateFunction() {
        NumberWrapper entity = new NumberWrapper(2);
        Service service = new Service();
        double condition = service.calculateFunction(entity);
        assertEquals(condition, 0.5, 0.0);
    }

    @org.testng.annotations.Test
    public void testCalculateFunctionAgain() {
        NumberWrapper entity = new NumberWrapper(3);
        Service service = new Service();
        double condition = service.calculateFunction(entity);
        assertEquals(condition, 27.0, 0.0);
    }
}