package edu.epam.carshop.service;

import edu.epam.carshop.entity.Brand;
import edu.epam.carshop.entity.Car;
import edu.epam.carshop.entity.CarShop;
import edu.epam.carshop.entity.Model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class ShopService {
    private static final Logger logger = LogManager.getLogger(ShopService.class);

    public List<Car> findByBrand(CarShop cars, Brand brand) {
        List<Car> currentCars = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (brand.equals(cars.getCar(i).getBrand())) {
                currentCars.add(cars.getCar(i));
            }
        }
        logger.info("All cars with brand {} found", brand);
        return currentCars;
    }

    public List<Car> findByModelAndAge(CarShop cars, Model model, int age) {
        List<Car> currentCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            if (model.equals(cars.getCar(i).getModel()) && age == cars.getCar(i).getYear()) {
                currentCars.add(cars.getCar(i));
            }
        }
        logger.info("All cars with model {} and age {} found", model, age);
        return currentCars;
    }

    public List<Car> findByAgeAndPrice(CarShop cars, int price, int age) {
        List<Car> currentCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            if (price == cars.getCar(i).getPrice() && age == cars.getCar(i).getYear()) {
                currentCars.add(cars.getCar(i));
            }
        }
        logger.info("All cars with price {} and age {} found", price, age);
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
        logger.info("Car {} with id {} found", car, id);
        return car;
    }
}