package edu.epam.carshop.report;

import edu.epam.carshop.entity.Car;

import java.util.ArrayList;

public class ShopReport {

    public void print(ArrayList<Car> currentCars){
        if (currentCars.size() == 0){
            System.out.println("Not found");
        }else {
            System.out.println("List of cars:");
            System.out.println(currentCars);
        }
    }
}
