package edu.epam.decomposition.task4.main;

import edu.epam.decomposition.task4.entity.NumberArray;
import edu.epam.decomposition.task4.report.NumberReport;
import edu.epam.decomposition.task4.service.NumberService;

//4.	Составить программу, печатающую значение true, если указанное высказывание
// является истинным, и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
public class Main {
  public static void main(String[] args) {
    NumberArray array = new NumberArray(34, 55, 65, 44);
    NumberService service = new NumberService();
    boolean result = service.isTwoEvenNumbers(array);
    NumberReport report = new NumberReport();
    report.printEvenReport(result, array);
  }
}
