package de.telran.lesson8;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        int result =0;
        String strOperation ="/";
        Scanner Scanner = new Scanner(System.in);
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();

        System.out.println("Введите число 1: " + a);
        System.out.println("Введите число 2:" +b);

        switch (strOperation) {
            case "+":
                result = a+b;
                break;

            case "-":
                result = a-b;
                break;

           case "*":
                result = a*b;
                break;

            case "/":
                if ( b == 0 )
                {
                    System.out.println("Введите корректное значение. На 0 делить нельзя!");
                    return;
                }
                result = a/b;
                break;

            default:
                System.out.println("Вы похоже написали странное… ");

        }
        System.out.println("Результат =  " + result);

    }
}
