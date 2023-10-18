package de.telran.lesson16;

import de.telran.lesson16.newer.Auto;

public class SimpleDop {
    public static void main(String[] args) {

        Auto myAuto1 = new Auto();
        myAuto1.fuelConsumption = 10;
        myAuto1.tankVolume = 50;
        myAuto1.carriageCapacity = 3000;
        myAuto1.weightAuto = 1500;
        myAuto1.move();
        System.out.println("Сколько груза может перевезти на автомобиль - " +myAuto1.getCountCargo());
        System.out.println("Сколько пассажиров может перевезти на автомобиль - " +myAuto1.getMaxPassengersCount());

        Auto auto2 = new Auto(20, 10, 2000, 4000);
        auto2.move();
        System.out.println("Сколько груза перевезет наш второй автомобиль auto2 - " +auto2.getCountCargo());
        System.out.println("Сколько пассажиров перевезет наш второй автомобиль auto2 - " +auto2.getMaxPassengersCount());

        Auto auto3 = new Auto("Red", "Audi", 10, 15, 5, 150, 1000, 3000);
        auto3.move();
        System.out.println("Сколько груза перевезет наш второй автомобиль auto3 - " +auto3.getCountCargo());
        System.out.println("Сколько пассажиров перевезет наш второй автомобиль auto3 - " +auto3.getMaxPassengersCount());
        System.out.println("Мы едем на auto3 - " +auto3.model+ ", Цвета - " +auto3.color);

    }
}

