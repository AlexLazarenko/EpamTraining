package edu.epam.day3.carshop.service;

import edu.epam.day3.carshop.entity.Brand;
import edu.epam.day3.carshop.entity.Car;
import edu.epam.day3.carshop.entity.CarShop;
import edu.epam.day3.carshop.entity.Model;

import java.util.ArrayList;


public class ShopService {

    public ArrayList<Car> findByBrand(CarShop cars, Brand brand) {
        ArrayList<Car> currentCars= new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (brand.equals(cars.getCar(i).getBrand())){
                currentCars.add(cars.getCar(i));
            }
        }
        return currentCars;
    }

    public ArrayList<Car> findByModelAndAge(CarShop cars, Model model, int age){
        ArrayList<Car> currentCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            if (model.equals(cars.getCar(i).getModel()) && age == cars.getCar(i).getYear()){
                currentCars.add(cars.getCar(i));
            }
        }
        return currentCars;
    }

    public ArrayList<Car> findByAgeAndPrice(CarShop cars, int price, int age){
        ArrayList<Car> currentCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            if (price == cars.getCar(i).getPrice() && age == cars.getCar(i).getYear()){
                currentCars.add(cars.getCar(i));
            }
        }
        return currentCars;
    }
}