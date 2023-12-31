package de.telran.lesson22.task1;

import java.util.Scanner;

import static de.telran.lesson6.RandomSimple.generateIntRandomInterval;

public class LotteryMain {
    public static void main(String[] args) {
        int setSize = 5;
        int range = 50;

        int lucky1 = 0;
        int lucky2 = 0;
        int lucky3 = 0;
        int lucky4 = 0;
        int lucky5 = 0;

        int userNum1 = 0;
        int userNum2 = 0;
        int userNum3 = 0;
        int userNum4 = 0;
        int userNum5 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши номера:");
        userNum1 = scanner.nextInt();
        userNum2 = scanner.nextInt();
        userNum3 = scanner.nextInt();
        userNum4 = scanner.nextInt();
        userNum5 = scanner.nextInt();

        int lucky, luckyCount = 1;

        while (luckyCount <= setSize) {
            //lucky = (int)(1 + Math.random() * ((range -1) +1));
            lucky = generateIntRandomInterval(1, range);
            if (luckyCount == 1) {
                lucky1 = lucky;
                luckyCount ++;
            } else if (luckyCount ==2) {
                lucky2 = lucky;
                luckyCount ++;
            } else if (luckyCount ==3) {
                lucky3 = lucky;
                luckyCount ++;
            } else if (luckyCount ==4) {
                lucky4 = lucky;
                luckyCount ++;
            } else if (luckyCount ==5) {
                lucky5 = lucky;
                luckyCount ++;
            }
        }
        System.out.println("Счастливые номера: "+lucky1+" "+lucky2+" "+lucky3+" "+lucky4+" "+lucky5);
        System.out.println();
        System.out.println("Пльзовательские номера: "+userNum1+" "+userNum2+" "+userNum3+" "+userNum4+" "+userNum5);
    }
}
