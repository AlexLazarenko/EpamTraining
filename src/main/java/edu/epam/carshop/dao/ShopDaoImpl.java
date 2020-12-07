package edu.epam.carshop.dao;

import edu.epam.carshop.entity.Brand;
import edu.epam.carshop.entity.Car;
import edu.epam.carshop.entity.CarShop;
import edu.epam.carshop.entity.Model;
import edu.epam.carshop.exception.DaoException;
import edu.epam.carshop.service.ShopService;
import edu.epam.carshop.service.ShopSortService;
import edu.epam.carshop.storage.CarShopStorage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ShopDaoImpl implements ShopDao {
    private static final Logger logger = LogManager.getLogger(ShopDaoImpl.class);
    private final CarShop shop = CarShopStorage.getInstance().getCars();
    private final ShopService service = new ShopService();
    private final ShopSortService sortService = new ShopSortService();
    private final List<Car> cars = shop.getCars();

    @Override
    public void createCar(Car car) throws DaoException {
        if (cars.contains(car)) {
            throw new DaoException("This car is already in store: " + car);
        }
        for (Car carInArray : cars) {
            if (car.getId() == carInArray.getId()) {
                throw new DaoException("Car with this id is already in store: " + car.getId());
            }
        }
        shop.addCar(car);
        logger.info("Add {} in CarShopStorage", car);
    }

    @Override
    public Car readCarById(int id) throws DaoException {
        if (!isValid(id)) {
            throw new DaoException("No car with this id in store: " + id);
        }
        Car car = service.findById(shop, id);
        return car;
    }

    @Override
    public List<Car> readCars() {
        List<Car> cars = shop.getCars();
        return cars;
    }

    @Override
    public void updateCar(int id, Car newCar) throws DaoException {
        if (!isValid(id)) {
            throw new DaoException("No car with this id in store: " + id);
        }
        Car shopCar = service.findById(shop, id);
        shopCar.setBrand(newCar.getBrand());
        shopCar.setColor(newCar.getColor());
        shopCar.setPrice(newCar.getPrice());
        shopCar.setYear(newCar.getYear());
        shopCar.setRegistrationNumber(newCar.getRegistrationNumber());
        logger.info("successfully updated {} ", newCar);
    }

    @Override
    public void deleteCar(int id) throws DaoException {
        Car car=readCarById(id);
        shop.remove(car);
        logger.info("car id={} successfully deleted", id);
    }

    private boolean isValid(int id) {
        List<Car> cars = shop.getCars();
        boolean isValid = false;
        for (Car carInArray : cars) {
            if (id == carInArray.getId()) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    @Override
    public List<Car> findByBrand(Brand brand) {
        List<Car> cars = service.findByBrand(shop, brand);
        return cars;
    }

    @Override
    public List<Car> findByModelAndAge(Model model, int age) {
        List<Car> cars = service.findByModelAndAge(shop, model, age);
        return cars;
    }

    @Override
    public List<Car> findByAgeAndPrice(int price, int age) {
        List<Car> cars = service.findByAgeAndPrice(shop, price, age);
        return cars;
    }

    @Override
    public List<Car> sortByYear(List<Car> cars) {
        sortService.sortByYear(cars);
        logger.info("Cars successfully sorted by year");
        return cars;

    }

    @Override
    public List<Car> sortByPrice(List<Car> cars) {
        sortService.sortByPrice(cars);
        logger.info("Cars successfully sorted by price");
        return cars;
    }

    @Override
    public List<Car> sortByBrand(List<Car> cars) {
        sortService.sortByBrand(cars);
        logger.info("Cars successfully sorted by brand");
        return cars;
    }

    @Override
    public List<Car> sortByYearThenPrice(List<Car> cars) {
        sortService.sortByYearThenPrice(cars);
        logger.info("Cars successfully sorted by year and price");
        return cars;
    }
}
