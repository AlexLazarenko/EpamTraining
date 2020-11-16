package edu.epam.decomposition.task7.main;

import edu.epam.decomposition.task7.entity.Point2D;
import edu.epam.decomposition.task7.report.Report;
import edu.epam.decomposition.task7.service.CoordinatesService;

//7.	Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y
public class Main {
    public static void main(String[] args) {
        Point2D a=new Point2D(1,1);
        Point2D b=new Point2D(1,2);
        Report report=new Report();
        CoordinatesService service=new CoordinatesService();
        report.print(service.isPointCloser(a,b));
    }
}
