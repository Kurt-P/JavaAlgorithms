package Test;

import edu.KurtP.SortingAlgorithms.SelectionSort;
import edu.KurtP.SortingAlgorithms.QuickSort;
import edu.KurtP.SortingAlgorithms.MergeSort;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
//        int[] array = new int[100];
        int[] array = new int[50];
//        int[] array = new int[10];
//        int[] array = new int[6];
//        int[] array = new int[0];
        String s1 = "";
        String s2 = "";
        
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
        }
        
        for (int i = 0; i < array.length; i++) {
            s1 += array[i] + ",";
        }
        
        System.out.printf("%s:\t %s\n", "The original array", s1);
        
//        SelectionSort.sort(array);
//        QuickSort.sort(array);
        MergeSort.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            s2 += array[i] + ",";
        }
        
        System.out.printf("%s:\t %s\n", "The sorted array", s2);
    }
}
