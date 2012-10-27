package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 1.2.10272012
 */
public class MergeSort {
    /*
     * The primary array will hold the original array. When the sort 
     * method is called, the secondary array will be created with 
     * a size of that equal to that of the primary array. They should always be 
     * the same size.
     */
    private static int[] primaryArray, secondaryArray;
    
    //We need the size of the primary array, to construct the secondary array.
    private static int primaryArraySize;
    
    /**
     * This method will call the other methods that will handle the sorting of 
     * the input array. It will then return the sorted array.
     * 
     * @param inputArray
     * @return the sorted array
     */
    public static int[] sort(int[] inputArray) {
        //You can't sort an empty array.
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }
        //An array of size 1 is sorted.
        if (inputArray.length == 1) {
            return inputArray;
        }
        primaryArray = inputArray;
        primaryArraySize = primaryArray.length;
        secondaryArray = new int[primaryArraySize];
        mergeSort(0, primaryArraySize - 1);
        
        return primaryArray;
    }
    
    /**
     * Merge sort with keep splitting the array up, until it is sorted. Then it 
     * will merge the sub arrays together.
     * 
     * @param low
     * @param high 
     */
    private static void mergeSort(int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }
    
    /**
     * The merge method will merge all the sorted sub arrays, that were split 
     * up during the mergeSort() into a single array.
     * 
     * @param low
     * @param middle
     * @param high 
     */
    private static void merge(int low, int middle, int high) {
        int i = low;
        int j = middle + 1;
        int k = low;
        
        for (int x = low; x <= high; x++) {
            secondaryArray[x] = primaryArray[x];
        }
        
        while (i <= middle && j <= high) {
            if (secondaryArray[i] <= secondaryArray[j]) {
                primaryArray[k] = secondaryArray[i];
                i++;
            }
            else {
                primaryArray[k] = secondaryArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            primaryArray[k] = secondaryArray[i];
            i++;
            k++;
        }
    }
}
