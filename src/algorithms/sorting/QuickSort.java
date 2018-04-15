package algorithms.sorting;

import utils.Commons;

import java.util.Arrays;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public static void main(String[] args) {

        int[] inputarray = { 3,2,5,1,4,5,8,9 } ;

        for(int i = 0; i<inputarray.length;i++){

            Commons.shuffleArray(inputarray);
            System.out.println("-------- ");

            System.out.println("Suffled ");

            System.out.println(Arrays.toString(inputarray));
            quicksort(inputarray,0,inputarray.length-1);

            System.out.println("Sorted ");
            System.out.println(Arrays.toString(inputarray));
            System.out.println("-------- ");

        }

    }

    private static void quicksort(int[] inputarray, int i, int length) {


        int pindex = ThreadLocalRandom.current().nextInt(i, length);

        int pivot = inputarray[pindex];


        int s = i;
        int e = length;

        while(s <= e){

            while(inputarray[s]<pivot){

                s++;

            }
            while(inputarray[e]>pivot){

                e--;

            }
            if(s<=e){

                Commons.swap(inputarray,s, e);
                s++;
                e--;

            }

        }


        if (i < e)
            quicksort(inputarray, i, e);
        if (s < length)
            quicksort(inputarray, s, length);

    }



}
