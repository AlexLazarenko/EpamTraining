package edu.epam.day3.carshop.entity;

import java.util.ArrayList;

public class CarShop {

    private ArrayList<Car> cars = new ArrayList<>();

    public Car getCar(int index) {
        return cars.get(index);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public int size(){
        return cars.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarShop carShop = (CarShop) o;

        return cars != null ? cars.equals(carShop.cars) : carShop.cars == null;
    }

    @Override
    public int hashCode() {
        return cars != null ? cars.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarShop{");
        sb.append("cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }
}

