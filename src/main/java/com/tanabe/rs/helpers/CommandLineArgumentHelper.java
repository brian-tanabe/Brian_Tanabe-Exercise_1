package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/2/2014.
 */
public class CommandLineArgumentHelper {
    protected String[] argsFromCommandLine;

    public CommandLineArgumentHelper(String[] argsFromCommandLine){
        this.argsFromCommandLine = argsFromCommandLine;
    }

    public double getDoubleFromCommandLineArgumentsOrPrintHelpAndClose(){
        if(argsFromCommandLine.length != 1) {
            printHelpMessage();
            closeApplication();
        }

        return extractDoubleFromArguments();
    }

        private double extractDoubleFromArguments() {
            try {
                return Double.parseDouble(argsFromCommandLine[0]);
            } catch (NumberFormatException ex){
                printHelpMessage();
                closeApplication();

                return -1;
            }
        }

    protected static void printHelpMessage(){
        System.err.println("You must specify a number to translate to the appropriate string representation");
        System.err.println("ie: java -jar brian-tanabe-exercise-one.jar 123.4");
        System.err.println("");
        System.err.println("exiting");
    }

        protected static void closeApplication(){
            System.exit(0);
        }
}
