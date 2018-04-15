package algorithms.sorting;

import utils.Commons;

import java.util.Arrays;

public class Mergesort {


    public static void main(String[] args) {

        int[] inputarray = { 3,2,5,1,4,5,8,9,6} ;




        for(int i = 0; i<inputarray.length;i++){

            Commons.shuffleArray(inputarray);
            System.out.println("-------- ");

            System.out.println("Suffled ");

            System.out.println(Arrays.toString(inputarray));


            mergesort(inputarray);

            System.out.println("Sorted ");
            System.out.println(Arrays.toString(inputarray));
            System.out.println("-------- ");

        }

    }

    public static void mergesort(int[] inputarray) {


        if(inputarray.length<=1){

            return;
        }

        int half = Math.round((inputarray.length/2));
        int[] left = new int[half];
        int[] right = new int[inputarray.length - half];

        for(int j = 0; j< inputarray.length; j++){

            if(j<half){

                left[j]=inputarray[j];

            }else{
                right[j-half]=inputarray[j];
            }

        }

        mergesort(left);
        mergesort(right);

        int r =0;
        int l =0;
        int ia = 0;


        while(l<left.length && r<right.length){


            if(left[l]<right[r]){

                inputarray[ia]=left[l];
                l++;

            }else{

                inputarray[ia]=right[r];
                r++;

            }

            ia++;

        }
        if(ia<inputarray.length){
            while(l<left.length){
                inputarray[ia]=left[l];
                ia++;
                l++;
            }
            while(r<right.length){
                inputarray[ia]=right[r];
                ia++;
                r++;
            }

        }



    }
}
