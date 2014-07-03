package com.tanabe.rs.helpers;

/**
 * Created by Brian on 7/2/2014.
 */
public class CommandLineArgumentHelper {
    protected String[] argsFromCommandLine;

    public CommandLineArgumentHelper(String[] argsFromCommandLine){
        this.argsFromCommandLine = argsFromCommandLine;
    }

    public double getDoubleFromCommandLineArgumentsOrPrintHelpAndClose() throws IllegalArgumentException {
        if(argsFromCommandLine.length != 1) {
            throw new IllegalArgumentException();
        } else {
            return extractDoubleFromArguments();
        }
    }

        private double extractDoubleFromArguments() throws NumberFormatException {
            return Double.parseDouble(argsFromCommandLine[0]);
        }
}
