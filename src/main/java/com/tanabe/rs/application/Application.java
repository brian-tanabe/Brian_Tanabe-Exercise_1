package com.tanabe.rs.application;

import com.tanabe.rs.helpers.CommandLineArgumentHelper;
import com.tanabe.rs.helpers.MessageHelper;
import com.tanabe.rs.translator.NumberToEnglishTranslator;

/**
 * Created by Brian on 7/2/2014.
 */
public class Application {

    public static void main(String[] args){
        try {
            CommandLineArgumentHelper argumentHelper = new CommandLineArgumentHelper(args);
            double numberToTranslate = argumentHelper.getDoubleFromCommandLineArgumentsOrPrintHelp();
            System.out.println(NumberToEnglishTranslator.translateNumber(numberToTranslate));
        } catch (Exception ex){
            System.out.println(MessageHelper.getHelpMessage());
        }
    }
}
