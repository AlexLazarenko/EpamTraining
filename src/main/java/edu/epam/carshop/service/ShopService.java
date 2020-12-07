package edu.epam.carshop.service;

import edu.epam.carshop.entity.Brand;
import edu.epam.carshop.entity.Car;
import edu.epam.carshop.entity.CarShop;
import edu.epam.carshop.entity.Model;

import java.util.ArrayList;
import java.util.List;


public class ShopService {

    public List<Car> findByBrand(CarShop cars, Brand brand) {
        List<Car> currentCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (brand.equals(cars.getCar(i).getBrand())) {
                currentCars.add(cars.getCar(i));
            }
        }
        return currentCars;
    }

    public List<Car> findByModelAndAge(CarShop cars, Model model, int age) {
        List<Car> currentCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            if (model.equals(cars.getCar(i).getModel()) && age == cars.getCar(i).getYear()) {
                currentCars.add(cars.getCar(i));
            }
        }
        return currentCars;
    }

    public List<Car> findByAgeAndPrice(CarShop cars, int price, int age) {
        List<Car> currentCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            if (price == cars.getCar(i).getPrice() && age == cars.getCar(i).getYear()) {
                currentCars.add(cars.getCar(i));
            }
        }
        return currentCars;
    }

    public Car findById(CarShop cars, int id) {
        Car car = new Car();
        for (int i = 0; i < cars.size(); i++) {
            if (id == (cars.getCar(i).getId())) {
                car = cars.getCar(i);
                break;
            }
        }
        return car;
    }
}