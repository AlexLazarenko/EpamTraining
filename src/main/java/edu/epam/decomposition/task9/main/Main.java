package edu.epam.decomposition.task9.main;


import edu.epam.decomposition.task9.entity.Circle;
import edu.epam.decomposition.task9.report.Report;
import edu.epam.decomposition.task9.service.Service;

//9.	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Service service = new Service();
        service.calculateAreaAndLength(circle);
        Report report = new Report();
        report.print(circle);
    }
}
