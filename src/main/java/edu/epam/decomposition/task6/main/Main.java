package edu.epam.decomposition.task6.main;

import edu.epam.decomposition.task6.entity.Time;
import edu.epam.decomposition.task6.report.TimeReport;
import edu.epam.decomposition.task6.service.TimeCalculatingService;

//6.	Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.
public class Main {
    public static void main(String[] args) {
        Time sec = new Time(3061);
        TimeCalculatingService service = new TimeCalculatingService();
        TimeReport report = new TimeReport();
        report.print(service.calculateTime(sec));
    }
}


