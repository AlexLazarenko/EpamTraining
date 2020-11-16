package edu.epam.day3.carshop.entity;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Car> cars = new ArrayList<>();

    public Car getCar(int index) {
        return cars.get(index);
    }

    public void addNewCar(int id, String color, String brand, int year, String model, int price, String registrationNumber) {
        Car newCar = new Car(id, color, brand, year, model, price, registrationNumber);
        cars.add(newCar);
    }

    public int size(){
        return cars.size();
    }


    @Override
    public String toString() {
        return "Shop{" +
                "cars=" + cars +
                '}';
    }
}

