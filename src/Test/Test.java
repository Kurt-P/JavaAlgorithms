package Test;

import edu.KurtP.SortingAlgorithms.BucketSort;
import edu.KurtP.SortingAlgorithms.InsertionSort;
import edu.KurtP.SortingAlgorithms.MergeSort;
import edu.KurtP.SortingAlgorithms.QuickSort;
import edu.KurtP.SortingAlgorithms.SelectionSort;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        String starting = "The starting array:";
        String sorted = "The sorted array:";
        String eTime = "Time for sort to complete (milliseconds):";
        long time;
        int[] array = new int[100000];
//        int[] array = new int[1000];
//        int[] array = new int[50];
//        int[] array = new int[10];
//        int[] array = new int[5];
//        int[] array = new int[0];
        
        //Start of the SelectionSort block - 1
        System.out.println("Selection Sort");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
        }
        System.out.printf("%s %s\n", starting, Arrays.toString(array));
        time = System.currentTimeMillis();
        SelectionSort.sort(array);
        System.out.printf("%s %d\n", eTime, (System.currentTimeMillis() - time));
        System.out.printf("%s %s\n\n", sorted, Arrays.toString(array));
        //End of the selection sort block
        
        //Start of the QuickSrot block - 2
        System.out.println("Quick Sort");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
        }
        System.out.printf("%s %s\n", starting, Arrays.toString(array));
        time = System.currentTimeMillis();
        QuickSort.sort(array);
        System.out.printf("%s %d\n", eTime, (System.currentTimeMillis() - time));
        System.out.printf("%s %s\n\n", sorted, Arrays.toString(array));
        //End of Quick sort block
        
        //Start of MergeSort block - 3
        System.out.println("Merge Sort");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
        }
        System.out.printf("%s %s\n", starting, Arrays.toString(array));
        time = System.currentTimeMillis();
        MergeSort.sort(array);
        System.out.printf("%s %d\n", eTime, (System.currentTimeMillis() - time));
        System.out.printf("%s %s\n\n", sorted, Arrays.toString(array));
        //End of MergeSort block
        
        //Start of BucketSort block - 4
        System.out.println("Bucket Sort");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
        }
        System.out.printf("%s %s\n", starting, Arrays.toString(array));
        time = System.currentTimeMillis();
        BucketSort.sort(array);
        System.out.printf("%s %d\n", eTime, (System.currentTimeMillis() - time));
        System.out.printf("%s %s\n\n", sorted, Arrays.toString(array));
        //End of BucketSort block
        
        //Start of InsertionSort block - 4
        System.out.println("Insertion Sort");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
        }
        System.out.printf("%s %s\n", starting, Arrays.toString(array));
        time = System.currentTimeMillis();
        InsertionSort.sort(array);
        System.out.printf("%s %d\n", eTime, (System.currentTimeMillis() - time));
        System.out.printf("%s %s\n\n", sorted, Arrays.toString(array));
        //End of InsertionSort block
    }
}
