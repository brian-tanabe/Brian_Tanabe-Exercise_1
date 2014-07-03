package com.tanabe.test;

import com.tanabe.rs.application.Application;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 7/2/2014.
 */
public class ApplicationIntegrationTest {
    private static PrintStream consolePrintStream;
    private static PrintStream newPrintStream;

    @BeforeClass
    public static void setUpConsolePrintingToString(){
        // Set up redirects here:
    }


    @Test
    public void testOneMillionTwoHundredThirtyFourThousandFiveHundredSixtySevenDollarsEightyNineCents(){


        String[] args = new String[] { "1234567.89"};
        Application.main(args);

        assertEquals("One million two hundred thirty-four thousand five hundred sixty-seven and 89/100 dollars", "");
    }
}
