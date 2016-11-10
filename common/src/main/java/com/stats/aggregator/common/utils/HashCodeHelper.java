package com.stats.aggregator.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Helper methods for hashing strings
 */
public final class HashCodeHelper {

    private static MessageDigest md;

    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generates unique hash value from text
     * @param text string to hashing
     * @return hashed string
     */
    public static String hash(String text){

        md.update(text.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (byte aByteData : byteData) {
            sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

    /**
     * Generates unique string value for device authorization key
     * @return unique authorization key
     */
    public static String getUniqueAuthKey(){
         String timeStamp = Long.toString(System.currentTimeMillis());
        return hash(timeStamp);
    }
}

