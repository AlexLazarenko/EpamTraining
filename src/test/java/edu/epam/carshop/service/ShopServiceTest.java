package edu.epam.carshop.service;

import edu.epam.carshop.entity.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ShopServiceTest {

    private ShopService shopService = new ShopService();
    private CarShop cars = new CarShop();

    @BeforeClass
    public void setUp() {
        ReaderService readerService = new ReaderService();
        readerService.readCar(cars,"testFile.dir");
    }

    @Test
    public void testFindByBrand() {
        List<Car> actual = shopService.findByBrand(cars, Brand.BMW);
        List<Car> expected = new ArrayList<>();
        Car car1 = new Car(8, Color.GREY, Brand.BMW, 2015, Model.UNIVERSAL, 17000, "numb8");
        Car car2 = new Car(16, Color.PINK, Brand.BMW, 2005, Model.COUPE, 10000, "numb16");
        expected.add(car1);
        expected.add(car2);
        assertEquals(actual, expected);

    }

    @Test
    public void testFindByModelAndAge() {
        List<Car> actual = shopService.findByModelAndAge(cars, Model.SEDAN, 2006);
        List<Car> expected = new ArrayList<>();
        Car car = new Car(15, Color.YELLOW, Brand.PEUGEOT, 2006, Model.SEDAN, 5000, "numb15");
        expected.add(car);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindByAgeAndPrice() {
        List<Car> actual = shopService.findByAgeAndPrice(cars, 8000, 2011);
        List<Car> expected = new ArrayList<>();
        Car car = new Car(10, Color.WHITE, Brand.OPEL, 2011, Model.UNIVERSAL, 8000, "numb10");
        expected.add(car);
        assertEquals(actual, expected);
    }
}