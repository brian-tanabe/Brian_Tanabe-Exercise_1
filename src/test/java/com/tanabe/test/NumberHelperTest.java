package com.tanabe.test;


import org.junit.Test;

import static com.tanabe.rs.helpers.NumberHelper.getIntegerPart;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberHelperTest {

    @Test
    public void testGetIntegerPartFromNumberWithFractionalPart(){
        assertEquals(3, getIntegerPart(3.14));
    }
}
