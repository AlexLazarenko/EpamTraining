package edu.epam.day3.carshop.main;


import edu.epam.day3.carshop.entity.Brand;
import edu.epam.day3.carshop.entity.CarShop;
import edu.epam.day3.carshop.entity.Model;
import edu.epam.day3.carshop.report.ShopReport;
import edu.epam.day3.carshop.service.ReaderService;
import edu.epam.day3.carshop.service.ShopService;

import java.io.IOException;

public class Main {

    public static void main(String[] args){ //throws IOException {

        CarShop cars = new CarShop();
        ReaderService readerService = new ReaderService();
        ShopService shopService = new ShopService();
        ShopReport report = new ShopReport();
         try {
             readerService.readCar(cars);
         }catch (IOException e){
             e.printStackTrace();
         }
        report.print(shopService.findByBrand(cars, Brand.BMW));
        report.print(shopService.findByModelAndAge(cars, Model.SEDAN, 2006));
        report.print(shopService.findByAgeAndPrice(cars,8000,2011));
        System.out.println(cars);
    }
}

