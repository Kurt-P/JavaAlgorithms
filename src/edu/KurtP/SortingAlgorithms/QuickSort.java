package edu.KurtP.SortingAlgorithms;

/**
 * @author Kurt P
 * @version 1.3.10272012
 */
public class QuickSort {
    private static int[] array;
    private static int number;
    
    /**
     * Sorts the inputted array
     * 
     * @param inputArray
     * @return the sorted array
     */
    public static int[] sort(int[] inputArray) {
        //Need to make sure that the inputed array is not empty.
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }
        //An array of lenght 1 is sorted.
        if (inputArray.length == 1) {
            return inputArray;
        }
        
        array = inputArray;
        number = array.length;
        quickSort(0, (number - 1));
        
        return array;
    }
    
    /**
     * This is what actually sorts the array.
     * 
     * @param low
     * @param high 
     */
    private static void quickSort(int low, int high) {
        int i = low, j = high;
        int pivot = array[low + (high - low) / 2];
        
        //Divide the array into two lists.
        while (i <= j) {
            //Work from the left moving right.
            while (array[i] < pivot) {
                i++;
            }
            //Work from the left moving right.
            while (array[j] > pivot) {
                j--;
            }
            /*
             * If values on the left are larger than those on the riht we need 
             * to swap them. So we do some recursive stuff to divi up the 
             * array even more to divide and conquer.
             */
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        /*
         * These are the recursive methods I was talking about. They will 
         * split the already semi-sorted array up and sort it even more.
         */
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }
    
    /**
     * This method will swap two element in the array.
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
