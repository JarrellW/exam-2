package rocks.zipcode.assessment2.fundamentals;

import java.util.Collections;
import java.util.regex.Pattern;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }


    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);

    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        return (stringToBeRepeated.join("", Collections.nCopies(numberOfTimeToRepeat, stringToBeRepeated)));
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        if(! Pattern.matches(".*[a-zA-Z]+.*[a-zA-Z]", string)) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if(! Pattern.matches(".*[0-9]+.*[0-9]", string)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String s = string;
        if (Pattern.matches("^[^a-zA-Z0-9]+$", s)) {
            return true;
        } else {
            return false;
        }
    }
}
