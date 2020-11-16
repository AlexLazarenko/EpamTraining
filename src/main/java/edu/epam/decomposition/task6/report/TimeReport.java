package edu.epam.decomposition.task6.report;

import edu.epam.decomposition.task6.entity.Time;

import java.util.ArrayList;

public class TimeReport {
    public void print(ArrayList<Integer> list) {

        System.out.println("There is "+list.get(0)+" hours "+list.get(1)+" minutes "+list.get(2)+" seconds");
    }
}
