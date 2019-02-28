package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] stringArray){
        super(stringArray);
    }




    public String[] removeDuplicatesExactly(int countDupToRemove) {
        String[] array = getArray();
        int newArraySize = array.length;
        String[] arrayTmp = new String[array.length];
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

    public String[] removeDuplicates(int countDupToRemove) {
        String[] array = getArray();
        int newArraySize = array.length;
        String[] arrayTmp = new String[array.length];
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

    private String[] returnArrayWithCorrectSize(String[] arrayToShorten, int size) {
        String[] retVal = new String[size];
        for (int k = 0; k < size; k++) {
            retVal[k] = arrayToShorten[k];
        }
        return retVal;
    }


    private Integer countOfSameElement(String[] array, String val) {
        Integer retVal = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] == val) {
                retVal++;
            }
        }
        return retVal;

    }
}
