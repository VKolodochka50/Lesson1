package de.telran.lesson22.task3;

import java.util.Arrays;
import java.util.Scanner;

import static de.telran.lesson22.task3.Constants.COUNT_SET_SIZE;
import static de.telran.lesson6.RandomSimple.generateIntRandomInterval;

public class LotteryMain {
    public static void main(String[] args) {

        int count = 3;
        int[][] userCountNumbers = new int[count] [COUNT_SET_SIZE];

        for (int i = 0; i<count; i++) {
            int[] userNumbers = Utils.getUserLotteryNumber();
            userCountNumbers[i] = userNumbers;
        }
        System.out.println(Arrays.toString(userCountNumbers));

        Lottery lottery = new Lottery();
        lottery.runLottery();
        int[] lotteryNumbers = lottery.getWinnerNumbers();
        System.out.println(Arrays.toString(lotteryNumbers));

        for (int i = 0; i<count; i++) {
            int countWinnerNumber = Utils.compareWinnerNumbers(lotteryNumbers, userCountNumbers[i]);
            System.out.println("Количество совпавших номеров - "+countWinnerNumber);
        }


    }
}
