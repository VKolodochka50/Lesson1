package de.telran.lesson3;

import java.util.Scanner;
public class ScannerSimple {
    public static void main(String[] args) {
        int myInt = 15;
        System.out.println("Print myInt = " +myInt);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Some digits: ");
        myInt = scanner.nextInt();
        System.out.println("Print entered digits from myInt" +myInt);



    }
}
