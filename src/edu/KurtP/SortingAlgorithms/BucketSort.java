package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 1.3.10282012
 */
public class BucketSort {

    /**
     * Sorts the array using a bucket sort method.
     *
     * @param inputArray - The array to be sorted
     * @return The sorted array
     */
    public static int[] sort(int[] inputArray) {
        //No point in sorting an already sorted array.
        if (inputArray.length == 1) {
            return inputArray;
        }

        int[] array, bucket;
        array = inputArray;
        bucket = new int[maxValue(array)];

        //Makes the buckets empty.
        for (int i : bucket) {
            bucket[i] = 0;
        }

        //Increments the amount of each element in the buckets.
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        for (int i = 0, j = 0; j < bucket.length; j++) {
            for (int k = bucket[j]; k > 0; k--) {
                array[i++] = j;
            }
        }
        return array;
    }

    /**
     * Gets the max value in an array.
     *
     * @param array - The array to get the max value of.
     * @return The max value found in the array plus one (1).
     */
    private static int maxValue(int[] array) {
        int max = 0;
        for (int x = 0; x < array.length; x++) {
            if (array[x] > max) {
                max = array[x];
            }
        }
        return max + 1;
    }
}
