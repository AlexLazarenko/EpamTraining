package edu.epam.carshop.comparator;

import edu.epam.carshop.entity.Car;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getPrice() - (car2.getPrice());
    }
}
