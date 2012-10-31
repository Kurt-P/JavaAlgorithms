package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 0.0.10302012
 */
public class RadixSort {
    
    public static int[] sort(int [] inputArray) {
        //Can't sort an empty array
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }
        //No point in sorting an array with a single element.
        if (inputArray.length == 1) {
            return inputArray;
        }
        int[] array = inputArray;
        int key;
        while (key > 0) {
            BucketSort.sort(array);
        }
        return array;
    }
}
