package edu.KurtP.Algorithms;

/**
 * @author Kurt P
 * @version 1.0.10252012
 */
public class SelectionSort {

    /**
     * Sorts the inputted array.
     *
     * @param inputArray
     * @return The sorted array.
     */
    public static int[] sort(int[] inputArray) {
        //The array variable
        int[] array = inputArray;
        int k, j;

        //The array will be looped through
        for (int i = 0; i < array.length - 1; i++) {
            k = i;
            //The values of the K will be compared to the values of J.
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }

            //Swap I with K
            if (k != i) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }

        //Return the sorted array.
        return array;
    }
}
