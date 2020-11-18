package edu.epam.day3.carshop.service;

import edu.epam.day3.carshop.entity.*;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class ReaderService {
    public CarShop readCar(CarShop cars) throws IOException {
        Reader in = new FileReader("file.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            Integer id = Integer.valueOf(record.get("Id"));
            //  Color.valueOf(record.get("Color"));
            //  Brand.valueOf(record.get("Brand"));
            Integer year = Integer.valueOf(record.get("Year"));
            //   Model.valueOf(record.get("Model"));
            Integer price = Integer.valueOf(record.get("Price"));
            String regNumber = record.get("RegNumber");
            Car car = new Car(id, Color.valueOf(record.get("Color")), Brand.valueOf(record.get("Brand")),
                    year, Model.valueOf(record.get("Model")), price, regNumber);
            cars.addCar(car);
        }in.close();
        return cars;
    }
}
