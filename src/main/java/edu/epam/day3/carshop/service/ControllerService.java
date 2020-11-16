package edu.epam.day3.carshop.service;

import edu.epam.day3.carshop.entity.Car;
import edu.epam.day3.carshop.entity.Shop;
import edu.epam.day3.carshop.report.ShopReport;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerService {

    Scanner in = new Scanner(System.in);
    ShopService service = new ShopService();
    ShopReport report = new ShopReport();

    public void findBrand(Shop cars) {
        System.out.println("What brand do u want to find?");
        String brand = in.next();
        ArrayList<Car> neededCars = service.findBrand(cars, brand);
        report.printNeededCars(neededCars);
    }

    public void findModelWithAge(Shop cars) {
        System.out.println("What model do u need?");
        String model = in.next();
        System.out.println("What age do u need?");
        int age = in.nextInt();
        ArrayList<Car> neededCars = service.findModelWithAge(cars, model, age);
        report.printNeededCars(neededCars);
    }

    public void findAgeWithPrice(Shop cars) {
        System.out.println("What age do u need?");
        int age = in.nextInt();
        System.out.println("What price do u need?");
        int price = in.nextInt();
        ArrayList<Car> neededCars = service.findAgeWithPrice(cars, price, age);
        report.printNeededCars(neededCars);
    }

    public void addCars(Shop cars) {
        System.out.println("Enter number of cars");
        int carsCount = in.nextInt();
        for (int i = 0; i < carsCount; i++) {
            cars = addCar(cars);
        }
    }
    public Shop addCar(Shop cars) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id");
        int id = in.nextInt();
        System.out.println("Enter color");
        String color = in.next();
        System.out.println("Enter year");
        int year = in.nextInt();
        System.out.println("Enter brand");
        String brand = in.next();
        System.out.println("Enter price");
        int price = in.nextInt();
        System.out.println("Enter model");
        String model = in.next();
        System.out.println("Enter registration number");
        String registrationNumber = in.next();
        cars.addNewCar(id, color, brand, year, model, price, registrationNumber);
        return cars;
    }
}