package com.tanabe.test;

import org.junit.Test;

import java.math.BigDecimal;

import static com.tanabe.rs.translator.NumberToEnglishTranslator.translateNumber;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberTranslatorTest {

    @Test
    public void testTranslateTwoThousandFiveHundredTwentyThreeAndFourDollars(){
        assertEquals("Two thousand five hundred twenty-three and 04/100 dollars", translateNumber(BigDecimal.valueOf(2523.04)));
    }
}
