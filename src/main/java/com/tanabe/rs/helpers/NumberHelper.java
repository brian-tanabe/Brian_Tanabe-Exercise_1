package com.tanabe.rs.helpers;

import java.math.BigDecimal;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberHelper {
    private static final int ZERO_DECIMAL_PLACES = 0;
    private static final int TWO_DECIMAL_PLACES = 2;

    public static BigDecimal getIntegerPart(double number){
        return BigDecimal.valueOf(number).setScale(ZERO_DECIMAL_PLACES, BigDecimal.ROUND_FLOOR);
    }

    public static int getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger(double number){
        BigDecimal numberAsBigDecimal = BigDecimal.valueOf(number);
        numberAsBigDecimal.setScale(TWO_DECIMAL_PLACES, BigDecimal.ROUND_FLOOR);
        numberAsBigDecimal = numberAsBigDecimal.subtract(BigDecimal.valueOf(number).setScale(ZERO_DECIMAL_PLACES, BigDecimal.ROUND_FLOOR));
        return numberAsBigDecimal.multiply(BigDecimal.valueOf(100)).intValue();
    }
}
