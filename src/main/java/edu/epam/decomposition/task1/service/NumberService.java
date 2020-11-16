package edu.epam.decomposition.task1.service;

import edu.epam.decomposition.task1.entity.NumberWrapper;

public class NumberService {
    public int findLastDigitSquares(NumberWrapper num) {
        return ((num.getMyNumber() % 10) * (num.getMyNumber() % 10))%10;
    }
}
