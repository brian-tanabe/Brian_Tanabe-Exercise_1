package com.tanabe.rs.translator;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.math.BigDecimal;

import static com.tanabe.rs.helpers.NumberHelper.getFractionalPart;
import static com.tanabe.rs.helpers.NumberHelper.getIntegerPart;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberToEnglishTranslator {


    public static String translateNumber(double number){
        BigDecimal integerPart = getIntegerPart(number);
        BigDecimal fractionalPart = getFractionalPart(number);

        RuleBasedNumberFormat numberFormat = new RuleBasedNumberFormat(RuleBasedNumberFormat.SPELLOUT);

        return String.format("%s and %d/100 dollars", numberFormat.format(integerPart), 00);
    }
}
