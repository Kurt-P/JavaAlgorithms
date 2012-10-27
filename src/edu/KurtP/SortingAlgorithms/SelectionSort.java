package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 1.3.10272012
 */
public class SelectionSort {

    private static int[] array;

    /**
     * Sorts the inputted array.
     *
     * @param inputArray
     * @return The sorted array.
     */
    public static int[] sort(int[] inputArray) {
        array = inputArray;
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
                swap(i, k);
            }
        }

        //Return the sorted array.
        return array;
    }

    /**
     * Swap two terms in an array.
     *
     * @param x
     * @param y
     */
    private static void swap(int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
