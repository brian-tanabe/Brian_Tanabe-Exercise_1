package com.tanabe.test;

import com.tanabe.rs.application.Application;
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

    @Test
    public void testOneMillionTwoHundredThirtyFourThousandFiveHundredSixtySevenDollarsEightyNineCents(){
        String[] args = new String[] { "1234567.89"};
        Application.main(args);

        assertEquals("One million two hundred thirty-four thousand five hundred sixty-seven and 89/100 dollars", byteArrayOutputStream.toString());
    }
}
