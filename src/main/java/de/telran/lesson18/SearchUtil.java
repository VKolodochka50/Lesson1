package de.telran.lesson18;

public class SearchUtil {

    static int searchLineBackward(int[] arr, int key) {
        int index = -1;
        for (int i=arr.length -1; i>=0; i--) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    static int searchLine(int[] arr, int key) {
        int index = -1;
        for (int i=0; i< arr.length; i++) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }


    /*static int[] searchAllLine(int[] arr, int key) {
        int isAllFinded;
        int[] index ;
        do {
            isAllFinded = false;
            for (int i = 0; i < arr.length; i++) {
                if (key == arr[i]) {
                    index = i;
                    break;
                }
            }
        } while (isAllFinded);
        return index[];
    }*/
}
