package com.tanabe.test;


import org.junit.Test;

import java.math.BigDecimal;

import static com.tanabe.rs.helpers.NumberHelper.getFractionalPart;
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
        assertEquals(BigDecimal.valueOf(0.0), getFractionalPart(10.0));
    }

    @Test
    public void testGetFractionalPartFromNumberWithFractionalPart(){
        assertEquals(BigDecimal.valueOf(0.14), getFractionalPart(3.14));
    }
}
