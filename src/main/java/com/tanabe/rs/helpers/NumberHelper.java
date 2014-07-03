package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberHelper {

    public static double getIntegerPart(double number){
        return Math.floor(number);
    }

    public static double getFractionalPart(double number){
        return number - Math.floor(number);
    }
}
