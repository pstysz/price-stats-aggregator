package com.stats.aggregator.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.Stream;

/**
 * Helper methods for static properties/resources
 */
public final class PropertiesHelper {

    private static Properties prop = new Properties();

    static {

        try {
            initializer(prop);

        } catch (Exception ex) {
            System.out.println(ex.toString());
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

    private static void initializer(Properties prop) throws  IOException{

        String[] commonResources = {"sensitive", "webapi", "rest-api"};
        String[] devEnvResources = {"db"};
        String[] prodEnvResources = {"prod-db"};
        String envType = System.getProperty("env");
        String[] resources;

        if(Objects.equals(envType, "prod")){
            resources = Stream.concat(Arrays.stream(commonResources), Arrays.stream(prodEnvResources))
                    .toArray(String[]::new);
        }
        else {
            resources = Stream.concat(Arrays.stream(commonResources), Arrays.stream(devEnvResources))
                    .toArray(String[]::new);
        }

        for(String res : resources){
            InputStream loadedProp = PropertiesHelper.class.getClassLoader().getResourceAsStream(res.concat(".properties"));
            prop.load(loadedProp);
            loadedProp.close();
        }
    }
}
