package edu.epam.decomposition.task6.service;

import edu.epam.decomposition.task6.entity.Time;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class TimeCalculatingServiceTest {

    @org.testng.annotations.Test
    public void testCalculateTime() {
        Time sec = new Time(3061);
        TimeCalculatingService service = new TimeCalculatingService();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0, 0);
        expected.add(1, 51);
        expected.add(2, 1);
        assertEquals(service.calculateTime(sec), expected);
    }
}