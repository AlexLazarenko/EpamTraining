package edu.epam.carshop.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    public final static String PROPERTY_PATH="src/main/resources/config.properties";

    public static String getProperty(String key) {
        Properties property = new Properties();
        try (FileInputStream fis = new FileInputStream(PROPERTY_PATH)) {
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String dir = property.getProperty(key);
        return dir;
    }
}

