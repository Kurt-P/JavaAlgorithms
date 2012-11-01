package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 1.3.10302012
 */
public class RadixSort {

    /**
     * The sort method for radix sort
     *
     * @param inputArray - The array to be sorted.
     * @return a sorted array
     */
    public static int[] sort(int[] inputArray) {
        //Can't sort an empty array
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }
        //No point in sorting an array with a single element.
        if (inputArray.length == 1) {
            return inputArray;
        }
        int[] array = inputArray;
        int someKey = largest(array);
        while (someKey > 0) {
            BucketSort.sort(array);
            someKey--;
        }
        return array;
    }

    /**
     * Gets the longest element and returns its length .
     *
     * @param array
     * @return
     */
    private static int largest(int[] array) {
        int max = 0;
        for (int i : array) {
            int l = String.valueOf(array[i]).length();
            if (l > max) {
                max = l;
            }
        }
        return max;
    }
}
