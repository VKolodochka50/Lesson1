package de.telran.lesson5;

import java.util.Scanner;

public class ScannerLive {
    public static void main(String[] args) {

        // Собрать информацию о человеке (пользовательский ввод)
        // Имя ,Возраст, Пол, Рост, Профессию

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя - ");

        String name = scanner.nextLine();

        System.out.println("Введите ваш возраст - ");

        int age = scanner.nextInt();

        System.out.println("Вы женщина? - Y/N ");

        boolean isFemale = scanner.nextLine().equalsIgnoreCase("Y");

        System.out.println("Введите ваш рост - ");

        double height = scanner.nextDouble();

        System.out.println("Введите вашу профессию - ");

        String job = scanner.nextLine();

        Worker worker = new Worker();
        worker.name = name;
        worker.age = age;
        worker.height = height;
        worker.job = job;
        worker.isFemale = isFemale;


    }

}