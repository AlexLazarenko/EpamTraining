package edu.epam.carshop.utils;

import edu.epam.carshop.entity.CarShop;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PropertiesLoaderTest {

    @Test
    public void testGetProperty() {
        String expected="src/test/resources/file.csv";
        String actual=PropertiesLoader.getProperty("testFile.dir");
        assertEquals(actual,expected);
    }
}