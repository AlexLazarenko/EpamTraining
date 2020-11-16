package edu.epam.decomposition.task10.report;

import java.util.Map;
import java.util.TreeMap;

public class DataReport {
    public void print( TreeMap<Double,Double> map) {
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry);
        }
    }
}
