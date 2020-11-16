package edu.epam.day3.carshop.report;

import edu.epam.day3.carshop.entity.Car;

import java.util.ArrayList;

public class ShopReport {

    public void printNeededCars(ArrayList<Car> currentCars){
        if (currentCars.size() == 0){
            System.out.println("Not found");
        }else {
            System.out.println("List of needed cars:");
            System.out.println(currentCars);
        }
    }
}
