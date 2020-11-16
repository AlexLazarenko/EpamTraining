package edu.epam.decomposition.task1.main;


//1.	Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.

import edu.epam.decomposition.task1.entity.NumberWrapper;
import edu.epam.decomposition.task1.report.NumberReport;
import edu.epam.decomposition.task1.service.NumberService;

public class Main {
    public static void main(String[] args) {
        NumberWrapper number = new NumberWrapper(13);
        NumberService service = new NumberService();
        int result = service.findLastDigitSquares(number);
        NumberReport report = new NumberReport();
        report.print(result);
    }
}


