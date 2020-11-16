package edu.epam.decomposition.task1.service;

import edu.epam.decomposition.task1.entity.NumberWrapper;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @org.testng.annotations.Test
    public void testFindLastDigitSquares() {
        NumberWrapper myNumber = new NumberWrapper(144);
        NumberService service = new NumberService();
        int condition = service.findLastDigitSquares(myNumber);
        assertEquals(condition, 6);
    }
}