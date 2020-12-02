package edu.epam.carshop.dao;

import edu.epam.carshop.entity.Brand;
import edu.epam.carshop.entity.Car;
import edu.epam.carshop.entity.CarShop;
import edu.epam.carshop.entity.Model;

import java.lang.reflect.Parameter;
import java.util.List;

public interface ShopDao {
    void createCar(Car car);

    Car readCarById(int id);

    List<Car> readCars();

    void readCarsFromFile(String dir);

    void updateCar(int id, Car newCar);

    void deleteCar(int id);

    List<Car> findByBrand(Brand brand);

    List<Car> findByModelAndAge(Model model, int age);

    List<Car> findByAgeAndPrice(int price, int age);

}
