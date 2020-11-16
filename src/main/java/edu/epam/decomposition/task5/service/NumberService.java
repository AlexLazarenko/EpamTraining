package edu.epam.decomposition.task5.service;

import edu.epam.decomposition.task5.entity.NumberWrapper;

public class NumberService {
    public boolean isNumberPerfect(NumberWrapper num) {
        int sum=1;
        for (int i=2;i<num.getMyNumber();i++){
            if (num.getMyNumber()%i==0){
                sum+=i;
            }
        }
        return sum==num.getMyNumber();
    }
}
