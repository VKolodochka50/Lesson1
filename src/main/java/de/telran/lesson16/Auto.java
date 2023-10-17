package de.telran.lesson16;

public class Auto {
    String color; //Color your Auto
    String model; //Model
    int mileage;
    int passengersCount; //Quantity of the passengers
    int tankVolume; //Available tank capacity
    int fuelConsumption; //Amount of the fuel consumption in Liter per 100 km
    int maxSpeed;
    int weightAuto; //Total weight of the Auto
    int carriageCapacity; //How many kilo this car is capable to carry

    public Auto(int tankVolume, int fuelConsumption, int weightAuto, int carriageCapacity) {
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
        this.weightAuto = weightAuto;
        this.carriageCapacity = carriageCapacity;
    }

    public Auto() {

    }

    public Auto(String color, String model, int mileage, int tankVolume, int fuelConsumption, int maxSpeed, int weightAuto, int carriageCapacity) {
        this.color = color;
        this.model = model;
        this.mileage = mileage;
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.weightAuto = weightAuto;
        this.carriageCapacity = carriageCapacity;
    }

    void move() {
        System.out.println("Автомобиль едет и проедет " + tankVolume / fuelConsumption * 100 + " км.");

        //Метод для расчета веса груза, который может перевезти автомобиль
    }

    int getCountCargo() {
        return carriageCapacity - weightAuto;
    }

    int getMaxPassengersCount() {
        return getCountCargo() / 100;
    }
}
