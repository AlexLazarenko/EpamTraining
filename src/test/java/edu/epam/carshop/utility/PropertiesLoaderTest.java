package edu.epam.carshop.utility;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PropertiesLoaderTest {

    @Test
    public void testGetProperty() {
        String expected = "src/test/resources/file.csv";
        String actual = PropertiesLoader.getProperty("testFile.dir");
        assertEquals(actual, expected);
    }
}