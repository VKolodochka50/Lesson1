package de.telran.lesson23.case3;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(Locale.ENGLISH);

        System.out.print("Введите значение первого аргумента: ");
        double argumentOne = sc.nextDouble();
        System.out.print("Разделитель между целой и дробной частью .");

        

        System.out.print("Введите знак операции: (+, -, /, *, %): ");
        String signStr = sc.next();
        char sign = signStr.charAt(0);
        if (sign != '+' && sign != '-' && sign != '/' && (sign != '*' && sign != '%')) {
            System.out.println(sign + "Не корректная операция");
            return; //exit
        }

        System.out.print("Введите значение второго аргумента: ");
        double argumentTwo = sc.nextDouble();

        /*if(argumentTwo == 0.0 && sign == '/'){
            System.out.println("На 0 делить нельзя!");
            return; //exit(1);
        }*/


        double result = 0.0;
        switch (sign) {
            case '+':
                result = argumentOne + argumentTwo;
                break;
            case '-':
                result = argumentOne - argumentTwo;
                break;
            case '*':
                result = argumentOne * argumentTwo;
                break;
            case '/':
                /*if (argumentTwo == 0.0) {
                    System.out.println("Please do not divide by zero!!!");
                return ;
                }*/
                result = argumentOne / argumentTwo;
                break;
            case '%':
                /*if (argumentTwo == 0.0) {
                    System.out.println("Please do not divide by zero!!!");
                    return ;
                }*/
                result = argumentOne % argumentTwo;
                break;
            default:
                System.out.println("This operation will be available in the next version :) ");
                return;
        }



        /*if(sign == '+') {
            result = argumentOne + argumentTwo;
        } else if (sign == '-') {
            result = argumentOne - argumentTwo;
        } else if (sign == '/') {
            result = argumentOne / argumentTwo;
        } else if (sign == '*') {
            result = argumentOne * argumentTwo;
        }*/
        System.out.println(String.format("%.2f %s %.2f = %.2f",argumentOne, sign, argumentTwo, result));

    }
}

//Напишите программу "Калькулятор", производящую вычисления с двумя числами c дробной частью.
//Тип данных вводимых аргументов должен быть Double.
//   Пользователь должен ввести с клавиатуры знак выполняемой математической операции в формате строки,
//   а затем программа должна преобразовать введенную строку в значение переменной типа Char (получить из
//   строки первый символ методом string.charAt(0);).
//Требуется произвести проверку введенных данных:
//   Если пользователь ввёл знак операции, отличный от +, -, *, / - выводить сообщение о том,
//   что указанная операция не поддерживается программой.
//   Если пользователь хочет выполнить операцию деления и в качестве значения второго аргумента
//   ввёл значение 0, то программа должна вывести сообщение о том, что на 0 делить нельзя.
//   В обеих ситуациях программа должна прекращать дальнейшую работу.
//   Результат вычислений необходимо вывести с точностью до двух чисел после запятой в формате
//   <значение переменной argumentOne> <знак математической операции> <значение переменной
//   argumentTwo> = <значение переменной результата>.