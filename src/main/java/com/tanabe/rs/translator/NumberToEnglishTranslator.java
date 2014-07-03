package com.tanabe.rs.translator;

import com.ibm.icu.text.RuleBasedNumberFormat;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

import static com.tanabe.rs.helpers.NumberHelper.getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger;
import static com.tanabe.rs.helpers.NumberHelper.getIntegerPart;

/**
 * Created by Brian on 7/2/2014.
 */
public class NumberToEnglishTranslator {


    public static String translateNumber(double number){
        BigDecimal integerPart = getIntegerPart(number);
        int fractionalPart = getFractionalPartTruncatedAfterTwoDecimalPlacesAsInteger(number);

        RuleBasedNumberFormat numberFormat = new RuleBasedNumberFormat(RuleBasedNumberFormat.SPELLOUT);

        return StringUtils.capitalize(String.format("%s and %02d/100 dollars", numberFormat.format(integerPart), fractionalPart));
    }
}
