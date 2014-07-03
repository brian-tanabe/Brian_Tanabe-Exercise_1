package com.tanabe.rs.helpers;

import java.math.BigDecimal;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberHelper {

    public static BigDecimal getIntegerPart(double number){
        return BigDecimal.valueOf(number).setScale(0, BigDecimal.ROUND_FLOOR);
    }

    public static int getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger(double number){
        BigDecimal numberAsBigDecimal = BigDecimal.valueOf(number);
        numberAsBigDecimal.setScale(2, BigDecimal.ROUND_FLOOR);
        numberAsBigDecimal = numberAsBigDecimal.subtract(BigDecimal.valueOf(number).setScale(0, BigDecimal.ROUND_FLOOR));
        return numberAsBigDecimal.multiply(BigDecimal.valueOf(100)).intValue();
    }
}
