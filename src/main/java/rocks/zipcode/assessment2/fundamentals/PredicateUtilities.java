package rocks.zipcode.assessment2.fundamentals;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        return (value % 2) == 0;

    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {
        return (value % 2) != 0;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        while (value > 0)
            value = value - 3;

        if (value == 0) {
            return true;
        }
        return false;
    }

    /**
     * @param value    - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {
        while (value > 0)
            value = value - multiple;

        if (value == 0) {
            return true;
        }
        return false;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        String myString = string;

        if (Character.isUpperCase(myString.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }
}
