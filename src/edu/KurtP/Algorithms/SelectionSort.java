package edu.KurtP.Algorithms;

/**
 * @author Kurt P
 * @version 1.0.10252012
 */
public class SelectionSort {
    
    public static int[] sort(int[] inputArray) {
        int[] array = inputArray;
        int k, j;
        
        for (int i = 0; i < array.length - 1; i++) {
            k = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
        return array;
    }
}
