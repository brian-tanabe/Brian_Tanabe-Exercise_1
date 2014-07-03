package com.tanabe.rs.application;

import com.tanabe.rs.helpers.CommandLineArgumentHelper;
import com.tanabe.rs.translator.NumberToEnglishTranslator;

/**
 * Created by Brian on 7/2/2014.
 */
public class Application {

    public static void main(String[] args){
        CommandLineArgumentHelper argumentHelper = new CommandLineArgumentHelper(args);
        double numberToTranslate = argumentHelper.getDoubleFromCommandLineArgumentsOrPrintHelpAndClose();
        System.out.println(NumberToEnglishTranslator.translateNumber(numberToTranslate));
    }
}
