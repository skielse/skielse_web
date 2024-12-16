package com.ski.estate.utils;

/**
 * @author ski
 * @date 2024/12/16
 */
public class StringUtil {
    public static String collectStringNumber(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
