package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 1.3.10282012
 */
public class InsertionSort {

    private static int[] array;

    /**
     * Sorts the array using an insertion sort method of sorting.
     *
     * @param inputArray - The array to be sorted
     * @return The sorted array
     */
    public static int[] sort(int[] inputArray) {
        //An array of lenght 1 is sorted.
        if (inputArray.length == 1) {
            return inputArray;
        }

        int i, j, key;
        //int[] array = inputArray;
        array = inputArray;

        //J is the deving line of the array
        for (j = 1; j < array.length; j++) {
            key = array[j];
            i = j;
            //Shift the smaller values to the left
            while (i > 0 && array[i - 1] >= key) {
                array[i] = array[i - 1];
                i--;
            }
            //Replace the key value, make suer it's the correct value.
            array[i] = key;
        }
        //Return the array
        return array;
    }
}
