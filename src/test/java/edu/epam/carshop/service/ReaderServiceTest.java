package edu.epam.carshop.service;

import edu.epam.carshop.entity.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class ReaderServiceTest {

    private CarShop cars = new CarShop();

    @Test
    public void testReadCar() throws IOException {
        ReaderService readerService=new ReaderService();
        CarShop actual=readerService.readCar(cars,"testFile.dir");
        CarShop expected=new CarShop();
        Car car1=new Car(1, Color.VIOLET, Brand.VOLKSWAGEN,2000, Model.SEDAN,2000,"numb1");
        Car car2=new Car(2, Color.GREEN, Brand.OPEL,2001, Model.HATCHBACK,2000,"numb2");
        Car car3=new Car(3, Color.GREY, Brand.FORD,2002, Model.UNIVERSAL,2500,"numb3");
        Car car4=new Car(4, Color.BLACK, Brand.RENAULT,2003, Model.COUPE,2500,"numb4");
        Car car5=new Car(5, Color.WHITE, Brand.AUDI,2004, Model.MINIVAN,5000,"numb5");
        Car car6=new Car(6, Color.VIOLET, Brand.MERCEDES,2013, Model.SEDAN,15000,"numb6");
        Car car7=new Car(7, Color.GREEN, Brand.PEUGEOT,2014, Model.HATCHBACK,13000,"numb7");
        Car car8=new Car(8, Color.GREY, Brand.BMW,2015, Model.UNIVERSAL,17000,"numb8");
        Car car9=new Car(9, Color.BLACK, Brand.VOLKSWAGEN,2012, Model.SEDAN,7500,"numb9");
        Car car10=new Car(10, Color.WHITE, Brand.OPEL,2011, Model.UNIVERSAL,8000,"numb10");
        Car car11=new Car(11, Color.BLUE, Brand.FORD,2010, Model.HATCHBACK,6500,"numb11");
        Car car12=new Car(12, Color.RED, Brand.RENAULT,2009, Model.SEDAN,5000,"numb12");
        Car car13=new Car(13, Color.BROWN, Brand.AUDI,2008, Model.HATCHBACK,10000,"numb13");
        Car car14=new Car(14, Color.ORANGE, Brand.MERCEDES,2007, Model.UNIVERSAL,12000,"numb14");
        Car car15=new Car(15, Color.YELLOW, Brand.PEUGEOT,2006, Model.SEDAN,5000,"numb15");
        Car car16=new Car(16, Color.PINK, Brand.BMW,2005, Model.COUPE,10000,"numb16");
        expected.addCar(car1);
        expected.addCar(car2);
        expected.addCar(car3);
        expected.addCar(car4);
        expected.addCar(car5);
        expected.addCar(car6);
        expected.addCar(car7);
        expected.addCar(car8);
        expected.addCar(car9);
        expected.addCar(car10);
        expected.addCar(car11);
        expected.addCar(car12);
        expected.addCar(car13);
        expected.addCar(car14);
        expected.addCar(car15);
        expected.addCar(car16);
        assertEquals(actual,expected);
    }
}
