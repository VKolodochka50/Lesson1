package de.telran.lesson18;

import java.util.Arrays;

import static de.telran.lesson18.SearchUtil.searchLine;
import static de.telran.lesson18.SearchUtil.searchLineBackward;

public class SimpleFind {
    public static void main(String[] args) {
        int[] arrInt  = {23, 10, 2, 7, 13, 8, 1, 66, 5, 9};
        int keyFind = 13;
        int indexFind = searchLine(arrInt, keyFind);
        int indexFindBack = searchLineBackward(arrInt, keyFind);
        System.out.println("А что у нас в массиве? " + Arrays.toString(arrInt));
        System.out.println("А что у нас содержит ключ: " + keyFind+ " и Индекс: " +indexFind);
        System.out.println("искали ключ: " +13+ " Индекс: " +searchLine(arrInt, 13));

        System.out.println("Искали в массиве обратным методом " + Arrays.toString(arrInt));
        System.out.println(" ключ cодержит: " + keyFind+ " и Индекс: " +indexFindBack);
        System.out.println("искали ключ: " +13+ " Индекс: " + searchLineBackward(arrInt, 13));
    }

}
