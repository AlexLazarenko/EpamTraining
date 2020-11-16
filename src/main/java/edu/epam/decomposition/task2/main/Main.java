package edu.epam.decomposition.task2.main;


import edu.epam.decomposition.task2.entity.YearMonthEntity;
import edu.epam.decomposition.task2.report.Report;
import edu.epam.decomposition.task2.service.Service;
//2.	Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце и корректно определялись все високосные года.
public class Main {
    public static void main(String[] args) {
        YearMonthEntity entity = new YearMonthEntity(2016, 2);
        Service service = new Service();
        String result = service.findDay(entity);
        Report report = new Report();
        report.print(result);
    }
}
