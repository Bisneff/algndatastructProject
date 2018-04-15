package utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Commons {

    public static void swap(int[] inputarray, int s, int e) {

        int swap = inputarray[s];
        inputarray[s]=inputarray[e];
        inputarray[e]=swap;

    }


    public static void shuffleArray(int[] ar) {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
