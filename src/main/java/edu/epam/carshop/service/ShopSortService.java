package edu.epam.carshop.service;

import edu.epam.carshop.comparator.CarBrandComparator;
import edu.epam.carshop.comparator.CarPriceComparator;
import edu.epam.carshop.comparator.CarYearComparator;
import edu.epam.carshop.entity.Car;

import java.util.Comparator;
import java.util.List;

public class ShopSortService {

    public List<Car> sortByPrice(List<Car> cars) {
        CarPriceComparator comparator = new CarPriceComparator();
        sort(cars, comparator);
        return cars;
    }

    public List<Car> sortByYear(List<Car> cars) {
        CarYearComparator comparator = new CarYearComparator();
        sort(cars, comparator);
        return cars;
    }

    public List<Car> sortByBrand(List<Car> cars) {
        CarBrandComparator comparator = new CarBrandComparator();
        sort(cars, comparator);
        return cars;
    }

    public List<Car> sortByYearThenPrice(List<Car> cars) {
        CarYearComparator yearComparator = new CarYearComparator();
        CarPriceComparator priceComparator = new CarPriceComparator();
        sort(cars, yearComparator.thenComparing(priceComparator));
        return cars;
    }


    private void sort(List<Car> cars, Comparator<Car> comparator) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.size() -1; i++) {
                if (comparator.compare(cars.get(i), cars.get(i + 1)) > 0) {
                    isSorted = false;
                    swap(cars, i);
                }
            }
        }
    }

    private void swap(List<Car> cars, int index) {
        Car temp = cars.get(index);
        cars.set(index, cars.get(index + 1));
        cars.set(index + 1, temp);
    }
}
