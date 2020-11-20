package edu.epam.carshop.service;

import edu.epam.carshop.entity.*;
import edu.epam.carshop.utils.PropertiesLoader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderService {
    private final int id = 0;
    private final int year = 0;
    private final int price = 0;
    private final String regNumber = "";

    public CarShop readCar(CarShop cars, String dir) {
        try (Reader in = new FileReader(PropertiesLoader.getProperty(dir))) {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
            for (CSVRecord record : records) {
                int id = Integer.valueOf(record.get("Id"));
                int year = Integer.valueOf(record.get("Year"));
                int price = Integer.valueOf(record.get("Price"));
                String regNumber = record.get("RegNumber");
                Car car = new Car(id, Color.valueOf(record.get("Color")), Brand.valueOf(record.get("Brand")),
                        year, Model.valueOf(record.get("Model")), price, regNumber);
                cars.addCar(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }
}
