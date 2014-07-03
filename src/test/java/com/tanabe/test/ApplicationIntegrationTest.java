package com.tanabe.test;

import com.tanabe.rs.application.Application;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 7/2/2014.
 */
public class ApplicationIntegrationTest {
    private static PrintStream oldPrintStream;
    private static PrintStream consolePrintStream;
    private static ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @BeforeClass
    public static void setUpConsolePrintingToString(){
        consolePrintStream = new PrintStream(byteArrayOutputStream);
        oldPrintStream = System.out;

        System.setOut(consolePrintStream);
    }

    @AfterClass
    public static void tearDown(){
        System.setOut(oldPrintStream);
    }

    @After
    public void clearPrintStream(){
        byteArrayOutputStream.reset();
    }

    @Test
    public void testOneMillionTwoHundredThirtyFourThousandFiveHundredSixtySevenDollarsEightyNineCents(){
        Application.main(new String[] { "1234567.89" });

        assertEquals("One million two hundred thirty-four thousand five hundred sixty-seven and 89/100 dollars", byteArrayOutputStream.toString().trim());
    }

    @Test
    public void testTranslateTwoThousandFiveHundredTwentyThreeAndFourDollars(){
        Application.main(new String[] { "2523.04" });

        assertEquals("Two thousand five hundred twenty-three and 04/100 dollars", byteArrayOutputStream.toString().trim());
    }

    @Test
    public void testOne(){
        Application.main(new String[] { "1.00" });

        assertEquals("One and 00/100 dollars", byteArrayOutputStream.toString().trim());
    }

    @Test
    public void testFiftyFiveCents(){
        Application.main(new String[] { "0.55" });

        assertEquals("Zero and 55/100 dollars", byteArrayOutputStream.toString().trim());
    }
}
