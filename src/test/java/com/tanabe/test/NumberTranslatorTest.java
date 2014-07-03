package com.tanabe.test;

import org.junit.Test;

import static com.tanabe.rs.translator.NumberToEnglishTranslator.translateNumber;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberTranslatorTest {

    @Test
    public void testTranslateTwoThousandFiveHundredTwentyThreeAndFourDollars(){
        assertEquals("Two thousand five hundred twenty-three and 04/100 dollars", translateNumber(2523.04));
    }

    @Test
    public void testOne(){
        assertEquals("One and 00/100 dollars", translateNumber(1.0));
    }
}
