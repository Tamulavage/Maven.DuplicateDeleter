package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public Integer[] removeDuplicatesExactly(int countDupToRemove) {
        Integer[] array = getArray();
        int newArraySize = array.length;
        Integer[] arrayTmp = new Integer[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (countDupToRemove != countOfSameElement(array, array[i])) {
                arrayTmp[j] = array[i];
                j++;
            } else {
                newArraySize--;
            }

        }
        return returnArrayWithCorrectSize(arrayTmp, newArraySize);
    }

    public Integer[] removeDuplicates(int countDupToRemove) {
        Integer[] array = getArray();
        int newArraySize = array.length;
        Integer[] arrayTmp = new Integer[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (countDupToRemove > countOfSameElement(array, array[i])) {
                arrayTmp[j] = array[i];
                j++;
            } else {
                newArraySize--;
            }

        }

        return returnArrayWithCorrectSize(arrayTmp, newArraySize);
    }

    private Integer[] returnArrayWithCorrectSize(Integer[] arrayToShorten, int size) {
        Integer[] retVal = new Integer[size];
        for (int k = 0; k < size; k++) {
            retVal[k] = arrayToShorten[k];
        }
        return retVal;
    }


    private Integer countOfSameElement(Integer[] array, Integer val) {
        Integer retVal = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] == val) {
                retVal++;
            }
        }
        return retVal;

    }
}
