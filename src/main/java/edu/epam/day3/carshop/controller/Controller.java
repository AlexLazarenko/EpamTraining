package edu.epam.day3.carshop.controller;

import edu.epam.day3.carshop.entity.Shop;
import edu.epam.day3.carshop.service.ControllerService;

import java.util.Scanner;

public class Controller {
    ControllerService controllerService=new ControllerService();
    public void run(Shop cars) {
        String answer;
        String text = "Please input '1' for add new car, '2' to find cars with needed brand," +
                " '3' to find cars with needed model and age, '4' to find cars with needed age and price, '5' to exit";
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(text);
            answer = in.next();
            switch (answer) {
                case ("1"):
                    controllerService.addCars(cars);
                    break;
                case ("2"):
                    controllerService.findBrand(cars);
                    break;
                case ("3"):
                    controllerService.findModelWithAge(cars);
                    break;
                case ("4"):
                    controllerService.findAgeWithPrice(cars);
                    break;
                case ("5"):
                    System.out.println("You are exit from the program!");
                    in.close();
                    break;
                default:
                    System.out.println("Choose 1 to 5");
            }
        } while (!(answer.equals("5")));
    }
}
