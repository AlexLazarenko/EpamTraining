package edu.epam.decomposition.task2.service;


import edu.epam.decomposition.task2.entity.YearMonthEntity;

public class Service {
    public String findDay(YearMonthEntity entity) {
        if (entity.getYear() % 4 != 0 || entity.getYear() % 100 == 0 && entity.getYear() % 400 != 0) {
            switch (entity.getMonth()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return "31 days";
                case 2:
                    return "28 days";
                case 4:
                case 6:
                case 9:
                case 11:
                    return "30 days";
            }
        } else {
            switch (entity.getMonth()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return "31 days";
                case 2:
                    return "29 days";
                case 4:
                case 6:
                case 9:
                case 11:
                    return "30 days";
            }
        }
        return null;
    }
}
