package edu.epam.decomposition.task10.main;


import edu.epam.decomposition.task10.entity.Data;
import edu.epam.decomposition.task10.report.DataReport;
import edu.epam.decomposition.task10.service.DataService;

//10.	Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
// Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй
// - соответствующие значения функции.
//
public class Main {
    public static void main(String[] args) {
        Data data=new Data(1,10,0.5);
        DataService service=new DataService();
        DataReport report=new DataReport();
        report.print(service.calculateFunction(data));
    }
}


