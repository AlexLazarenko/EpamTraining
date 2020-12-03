package edu.epam.carshop.dao;

import edu.epam.carshop.entity.Brand;
import edu.epam.carshop.entity.Car;
import edu.epam.carshop.entity.CarShop;
import edu.epam.carshop.entity.Model;
import edu.epam.carshop.reader.DataReader;
import edu.epam.carshop.service.ShopService;
import edu.epam.carshop.storage.CarShopStorage;
import edu.epam.carshop.utility.PropertiesLoader;

import java.util.List;

public class ShopDaoImpl implements ShopDao {
    private final CarShop shop = CarShopStorage.getInstance().getCars();
    private final ShopService service = new ShopService();

    @Override
    public void createCar(Car car) {
        List<Car> cars = shop.getCars();
        if (cars.contains(car)) {
            throw new IllegalArgumentException("This car is already in store: " + car);
        }
        for (Car carInArray : cars) {
            if (car.getId() == carInArray.getId()) {
                throw new IllegalArgumentException("Car with this id is already in store: " + car.getId());
            }
        }
        cars.add(car);
        shop.setCars(cars);
        CarShopStorage.getInstance().setCars(shop);
    }

    @Override
    public Car readCarById(int id) {
        Car car = shop.getCar(id);
        return car;
    }

    @Override
    public List<Car> readCars() {
        List<Car> cars = shop.getCars();
        return cars;
    }

    public void readCarsFromFile(String dir) {
        DataReader reader = new DataReader();
        CarShop shop = reader.readCar(CarShopStorage.getInstance().getCars(), PropertiesLoader.getProperty(dir));
        CarShopStorage.getInstance().setCars(shop);
    }

    @Override
    public void updateCar(int id, Car newCar) {
        Car shopCar = shop.getCar(id);
        shopCar.setBrand(newCar.getBrand());
        shopCar.setColor(newCar.getColor());
        shopCar.setPrice(newCar.getPrice());
        shopCar.setYear(newCar.getYear());
        shopCar.setRegistrationNumber(newCar.getRegistrationNumber());
    }

    @Override
    public void deleteCar(int id) {
        List<Car> cars = shop.getCars();
        for (Car car : cars) {
            if (car.getId() == id) {
                cars.remove(car);
                break;
            }
        }
        shop.setCars(cars);
        CarShopStorage.getInstance().setCars(shop);
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
}
