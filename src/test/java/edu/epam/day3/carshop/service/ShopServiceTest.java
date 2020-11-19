package edu.epam.day3.carshop.service;

import edu.epam.day3.carshop.entity.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class ShopServiceTest {

    private ShopService shopService = new ShopService();
    private CarShop cars = new CarShop();

    @BeforeClass
    public void setUp() throws IOException {
        ReaderService readerService = new ReaderService();
        readerService.readCar(cars);
    }

    @Test
    public void testFindByBrand() {
        ArrayList<Car> actual = shopService.findByBrand(cars, Brand.BMW);
        ArrayList<Car> expected = new ArrayList<>();
        Car car1 = new Car(8, Color.GREY, Brand.BMW, 2015, Model.UNIVERSAL, 17000, "numb8");
        Car car2 = new Car(16, Color.PINK, Brand.BMW, 2005, Model.COUPE, 10000, "numb16");
        expected.add(car1);
        expected.add(car2);
        assertEquals(actual, expected);

    }

    @Test
    public void testFindByModelAndAge() {
        ArrayList<Car> actual = shopService.findByModelAndAge(cars, Model.SEDAN, 2006);
        ArrayList<Car> expected = new ArrayList<>();
        Car car = new Car(15, Color.YELLOW, Brand.PEUGEOT, 2006, Model.SEDAN, 5000, "numb15");
        expected.add(car);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindByAgeAndPrice() {
        ArrayList<Car> actual = shopService.findByAgeAndPrice(cars, 8000, 2011);
        ArrayList<Car> expected = new ArrayList<>();
        Car car = new Car(10, Color.WHITE, Brand.OPEL, 2011, Model.UNIVERSAL, 8000, "numb10");
        expected.add(car);
        assertEquals(actual, expected);
    }
}