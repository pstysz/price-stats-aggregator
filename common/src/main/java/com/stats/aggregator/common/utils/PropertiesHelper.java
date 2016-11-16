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
            initializer(prop, input);

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



    private static void initializer(Properties prop, InputStream input) throws  IOException{

        String resourcesLocation = "\\src\\main\\resources";

        File[] globalFolderContent = new File(".").listFiles();
        if(globalFolderContent == null)
            return;

        for(File dir : globalFolderContent){
            if(dir == null || !dir.isDirectory())
                continue;

            File folder = new File(dir.getName() + resourcesLocation);
            File[] listOfFiles = folder.listFiles();

            if(listOfFiles == null)
                continue;

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
    }
}
