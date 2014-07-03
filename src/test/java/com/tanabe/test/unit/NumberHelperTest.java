package com.tanabe.test.unit;


import org.junit.Test;

import java.math.BigDecimal;

import static com.tanabe.rs.helpers.NumberHelper.getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger;
import static com.tanabe.rs.helpers.NumberHelper.getIntegerPart;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberHelperTest {

    @Test
    public void testGetIntegerPartFromNumberWithFractionalPart(){
        assertEquals(BigDecimal.valueOf(3), getIntegerPart(3.14));
    }

    @Test
    public void testGetIntegerPartFromNumberWithoutFractionalPart(){
        assertEquals(BigDecimal.valueOf(1), getIntegerPart(1.0));
    }

    @Test
    public void testGetFractionalPartFromNumberWithoutFractionalPart(){
        assertEquals(0, getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger(10.0));
    }

    @Test
    public void testGetFractionalPartFromNumberWithFractionalPart(){
        assertEquals(14, getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger(3.14));
    }

    @Test
    public void testTruncatingFractionalPartAfterTwoDecimalPlaces(){
        assertEquals(14, getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger(3.1415));
    }

    @Test
    public void testTruncatingFractionalPartAfterTwoDecimalPlacesWhereInputWouldTriggerRoundingUp(){
        assertEquals(99, getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger(9.99999999));
    }
}
