package edu.epam.decomposition.task2.service;

import edu.epam.decomposition.task2.entity.YearMonthEntity;

import static org.testng.Assert.*;

public class ServiceTest {

    @org.testng.annotations.Test
    public void testFindDay() {
        YearMonthEntity entity = new YearMonthEntity(2020, 2);
        Service service = new Service();
        String condition = service.findDay(entity);
        assertEquals(condition, "29 days");
    }
}