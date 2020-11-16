package edu.epam.decomposition.task10.service;

import edu.epam.decomposition.task10.entity.Data;
import java.util.TreeMap;

public class DataService {
    public TreeMap<Double,Double> calculateFunction(Data data) {
        TreeMap<Double,Double> map=new TreeMap<>();
        for (data.getA();data.getA()<=data.getB();data.setA(data.getA()+data.getH())){
            map.put(data.getA(),Math.tan(data.getA()));
        }
        return map;
        }
    }

