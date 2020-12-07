package edu.epam.carshop.storage;

import edu.epam.carshop.entity.Car;
import edu.epam.carshop.entity.CarShop;

public class CarShopStorage {
    private static CarShopStorage instance;
    private CarShop shop = new CarShop();

    private CarShopStorage() {
    }

    public static CarShopStorage getInstance() {
        if (instance == null) {
            instance = new CarShopStorage();
        }
        return instance;
    }

    public CarShop getCars() {
        return shop;
    }

    public void addCar(Car car) {
        shop.addCar(car);
    }

    public void remove(Car car) {
        shop.remove(car);
    }
}
