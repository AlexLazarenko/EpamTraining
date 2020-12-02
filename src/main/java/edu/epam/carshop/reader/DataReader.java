package edu.epam.carshop.reader;

import edu.epam.carshop.entity.*;
import edu.epam.carshop.utility.PropertiesLoader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class DataReader {
    private int id = 0;
    private int year = 0;
    private int price = 0;
    private String regNumber = "";

    public CarShop readCar(CarShop cars, String dir) {
        try (Reader in = new FileReader(PropertiesLoader.getProperty(dir))) {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
            for (CSVRecord record : records) {
                id = Integer.valueOf(record.get("Id"));
                year = Integer.valueOf(record.get("Year"));
                price = Integer.valueOf(record.get("Price"));
                regNumber = record.get("RegNumber");
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
