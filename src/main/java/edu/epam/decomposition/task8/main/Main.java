package edu.epam.decomposition.task8.main;

import edu.epam.decomposition.task8.entity.NumberWrapper;
import edu.epam.decomposition.task8.report.Report;
import edu.epam.decomposition.task8.service.Service;
//8.	Вычислить значение функции
public class Main {
    public static void main(String[] args) {
     NumberWrapper numberWrapper= new NumberWrapper(3);
        Service service = new Service();
        double result = service.calculateFunction(numberWrapper);
        Report report = new Report();
        report.print(result);
    }
}
