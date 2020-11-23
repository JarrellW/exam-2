package rocks.zipcode.assessment2.arrays;

import java.util.stream.IntStream;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] answer = new Integer[integerArray.length + 1];
        for (int i = 0; i < integerArray.length; i++) {
            answer[i] = integerArray[i];
        }
        answer[answer.length - 1] = valueToBeAdded;

        return answer;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer[] result = new Integer[integerArray.length];

        for (int i = 0; i < indexToInsertAt; i++)
            result[i] = integerArray[i];
        result[indexToInsertAt] = valueToBeInserted;
        for (int i = indexToInsertAt + 1; i < integerArray.length; i++)
            result[i] = integerArray[i];
        return result;
    }


    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];

}

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int i = integerArray.length +1 ; i >= 0; i++) {
            if (++integerArray[i] < 10)
                return integerArray;
            integerArray[i] = 0;
        }
        integerArray = new Integer[integerArray.length + 1];
        integerArray[0] = 1;
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
