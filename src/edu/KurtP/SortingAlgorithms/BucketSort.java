package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 0.0.10282012
 */
public class BucketSort {
    private static int[] array, bucket;
    //private static int max = 0;
    
    public static int[] sort(int[] inputArray) {
        array = inputArray;
        bucket = new int[maxValue()];
        
        for (int i : bucket) { bucket[i] = 0; }
        
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
    
    private static int maxValue() {
        int max = 0;
        for (int x  = 0; x < array.length; x++) {
            if (array[x] > max) {
                max = array[x];
            }
        }
        return max + 1;
    }
}
