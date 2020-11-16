package edu.epam.day3.carshop.main;

import edu.epam.day3.carshop.controller.Controller;
import edu.epam.day3.carshop.entity.Shop;

public class Main {

    public static void main(String[] args) {

        Shop cars = new Shop();
        Controller controller = new Controller();
        controller.run(cars);

    }
}

