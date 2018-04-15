package algorithms.sorting;

import utils.Commons;

import java.util.Arrays;

public class Heapsort {


    public static void sort(int array[]) {

        int n = array.length;

        for (int i=n-1; i>=0; i--){

            Commons.swap(array, i,0);
            heapify(array, i, 0);


        }


    }

    public static void heapify(int[] array, int n, int i) {

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[largest] < array[l]) {

            largest = l;

        }

        if (r < n && array[largest] < array[r]) {

            largest = r;

        }


        if (largest != i) {

            swap(array, i, largest);
            heapify(array, n, largest);

        }


    }


    public static void main(String[] args) {

        int[] inputarray = {3, 2, 5, 1, 4, 5, 8, 9};

        int n = inputarray.length;

        Commons.shuffleArray(inputarray);
        System.out.println("-------- ");

        System.out.println("Suffled ");

        System.out.println(Arrays.toString(inputarray));
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(inputarray, n, i);

        System.out.println("Heap ");
        System.out.println(Arrays.toString(inputarray));

        sort(inputarray);
        System.out.println("Sorted ");
        System.out.println(Arrays.toString(inputarray));
        System.out.println("-------- ");


    }

    private static void swap(int[] inputarray, int s, int e) {

        int swap = inputarray[s];
        inputarray[s] = inputarray[e];
        inputarray[e] = swap;

    }


}
