package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/2/2014.
 */
public class MessageHelper {
    private static final String NEW_LINE = "\r\n";

    public static String getHelpMessage(){
        String helpMessage = "You must specify a number to translate to the appropriate string representation" + NEW_LINE;
        helpMessage +=       "ie: java -jar brian-tanabe-exercise-one.jar 123.4" + NEW_LINE + NEW_LINE;
        helpMessage +=       "exiting";

        return helpMessage;
    }
}
