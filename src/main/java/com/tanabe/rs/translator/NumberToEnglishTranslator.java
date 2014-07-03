package com.tanabe.rs.translator;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.math.BigDecimal;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberToEnglishTranslator {


    public static String translateNumber(BigDecimal number){
        RuleBasedNumberFormat numberFormat = new RuleBasedNumberFormat(RuleBasedNumberFormat.SPELLOUT);
        return numberFormat.format(number);
    }
}