package com.tanabe.test;


import org.junit.Test;

import static com.tanabe.rs.helpers.NumberHelper.getFractionalPart;
import static com.tanabe.rs.helpers.NumberHelper.getIntegerPart;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberHelperTest {

    @Test
    public void testGetIntegerPartFromNumberWithFractionalPart(){
        assertEquals(3.0, getIntegerPart(3.14));
    }

    @Test
    public void testGetIntegerPartFromNumberWithoutFractionalPart(){
        assertEquals(1.0, getIntegerPart(1.0));
    }

    @Test
    public void testGetFractionalPartFromNumberWithoutFractionalPart(){
        assertEquals(0.00, getFractionalPart(10.0));
    }
}
