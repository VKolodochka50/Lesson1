package de.telran.lesson18;

import java.util.Arrays;

public class SortingUtil {
    public static void boobleSort(int[] arrInt) {
        boolean isSorted;
        do {
            isSorted = false;
            //for (int i=0; i < arrInt.length; i++) { содержит ошибку
            for (int i = 0; i < arrInt.length - 1; i++) {
                if (arrInt[i] > arrInt[i + 1]) {
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[i + 1];
                    arrInt[i + 1] = temp;
                    isSorted = true;
                    System.out.println("Within sorting cycle " + Arrays.toString(arrInt));
                }
            }
        } while (isSorted);
    }
}