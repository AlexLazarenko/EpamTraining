package edu.epam.decomposition.task10.service;

import edu.epam.decomposition.task10.entity.Data;

import java.util.TreeMap;

import static org.testng.Assert.assertEquals;

public class DataServiceTest {

    @org.testng.annotations.Test
    public void testCalculateFunction() {
        Data data = new Data(1, 5, 0.5);
        DataService service = new DataService();
        TreeMap<Double, Double> expected = service.calculateFunction(data);
        TreeMap<Double, Double> actual = new TreeMap<>();
        actual.put(1.0, 1.5574077246549023);
        actual.put(1.5, 14.101419947171719);
        actual.put(2.0, -2.185039863261519);
        actual.put(2.5, -0.7470222972386603);
        actual.put(3.0, -0.1425465430742778);
        actual.put(3.5, 0.3745856401585947);
        actual.put(4.0, 1.1578212823495775);
        actual.put(4.5, 4.637332054551185);
        actual.put(5.0, -3.380515006246586);
        assertEquals(actual, expected);
    }
}