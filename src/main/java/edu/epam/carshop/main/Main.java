package edu.epam.carshop.main;

import edu.epam.carshop.entity.CarShop;
import edu.epam.carshop.report.ShopReport;
import edu.epam.carshop.service.ReaderService;
import edu.epam.carshop.service.ShopService;
import edu.epam.carshop.utils.PropertiesLoader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CarShop cars=new CarShop();
        System.out.println(PropertiesLoader.getProperty("file.dir"));
        ReaderService readerService=new ReaderService();
        ShopService shopService = new ShopService();
        ShopReport report = new ShopReport();

        System.out.println(  readerService.readCar(cars,PropertiesLoader.getProperty("file.dir")));
    }
}
