package de.telran.lesson18;

import java.util.Arrays;

public class  SimpleBubbleSort {
    public static void main(String[] args) {
        int[] arrInt = {23, 10, 2, 7, 13, 8, 1, 66, 5, 9};
        System.out.println(Arrays.toString(arrInt));

        SortingUtil.boobleSort(arrInt);

        System.out.println("Sorted! " + Arrays.toString(arrInt));
    }


}

