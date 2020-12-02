package edu.epam.carshop.storage;

import edu.epam.carshop.entity.CarShop;

public class CarShopStorage {
    private static CarShopStorage instance;
    private CarShop cars = new CarShop();

    private CarShopStorage() {
    }

    public static CarShopStorage getInstance() {
        if (instance == null) {
            instance = new CarShopStorage();
        }
        return instance;
    }

    public CarShop getCars() {
        return cars;
    }

    public void setCars(CarShop cars) {
        this.cars = cars;
    }
}
