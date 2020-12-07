package edu.epam.carshop.dao;

import edu.epam.carshop.entity.Brand;
import edu.epam.carshop.entity.Car;
import edu.epam.carshop.entity.CarShop;
import edu.epam.carshop.entity.Model;
import edu.epam.carshop.exception.DaoException;

import java.util.List;

public interface ShopDao {
    void createCar(Car car) throws DaoException;

    Car readCarById(int id) throws DaoException;

    List<Car> readCars();

    void updateCar(int id, Car newCar) throws DaoException;

    void deleteCar(int id) throws DaoException;

    List<Car> findByBrand(Brand brand);

    List<Car> findByModelAndAge(Model model, int age);

    List<Car> findByAgeAndPrice(int price, int age);

    List<Car> sortByYear(List<Car> cars);

    List<Car> sortByPrice(List<Car> cars);

    List<Car> sortByBrand(List<Car> cars);

    List<Car> sortByYearThenPrice(List<Car> cars);

}
