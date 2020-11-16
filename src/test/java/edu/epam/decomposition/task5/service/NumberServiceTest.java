package edu.epam.decomposition.task5.service;

import edu.epam.decomposition.task5.entity.NumberWrapper;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @org.testng.annotations.Test
    public void testIsNumberPerfect() {
        NumberWrapper number = new NumberWrapper(28);
        NumberService service = new NumberService();
        boolean condition = service.isNumberPerfect(number);
        assertTrue(condition);
    }

    @org.testng.annotations.Test
    public void isNumberPerfectFalse() {
        NumberWrapper number = new NumberWrapper(27);
        NumberService service = new NumberService();
        boolean condition = service.isNumberPerfect(number);
        assertFalse(condition);
    }
    }
