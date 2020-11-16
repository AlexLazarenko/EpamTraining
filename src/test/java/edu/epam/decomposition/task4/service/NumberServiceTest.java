package edu.epam.decomposition.task4.service;

import edu.epam.decomposition.task4.entity.NumberArray;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @org.testng.annotations.Test
    public void testIsTwoEvenNumbers() {
        NumberArray array = new NumberArray(34, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertTrue(condition);
    }
    @org.testng.annotations.Test
    public void isTwoEvenNumbersFalse() {
        NumberArray array = new NumberArray(33, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertFalse(condition);
    }
    }
