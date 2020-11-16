package edu.epam.decomposition.task5.main;


import edu.epam.decomposition.task5.entity.NumberWrapper;
import edu.epam.decomposition.task5.report.NumberReport;
import edu.epam.decomposition.task5.service.NumberService;

//5.	Составить программу, печатающую значение true, если указанное высказывание является истинным,
// и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
public class Main {
    public static void main(String[] args) {
        NumberWrapper number = new NumberWrapper(28);
        NumberService service = new NumberService();
        NumberReport report = new NumberReport();
        boolean isPerfect=service.isNumberPerfect(number);
        report.print(number,isPerfect);
    }
}


