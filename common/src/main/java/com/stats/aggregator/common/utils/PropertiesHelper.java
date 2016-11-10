package com.stats.aggregator.common.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Helper methods for static properties/resources
 */
public final class PropertiesHelper {

    private static Properties prop;

    static {
        prop = new Properties();
        InputStream input = null;

        try {
            File folder = new File(".\\src\\main\\resources");
            File[] listOfFiles = folder.listFiles();

            if(listOfFiles != null) {
                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        input = PropertiesHelper.class.getClassLoader().getResourceAsStream(file.getName());
                        if (input == null) {
                            continue;
                        }

                        prop.load(input);
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Gets property value from resources base on it's name
     * @param name property name
     * @return property value
     */
    public static String getProperty(String name){
        return prop.getProperty(name);
    }

    /**
     * Gets property value from resources base on it's name
     * @param name property name
     * @param defaultValue default value returned if property/value does not exist
     * @return property value
     */
    public static String getProperty(String name, String defaultValue){
        return prop.getProperty(name, defaultValue);
    }
}
