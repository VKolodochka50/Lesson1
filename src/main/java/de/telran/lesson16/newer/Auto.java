package de.telran.lesson16.newer;

public class Auto {
    public String color; //Color your Auto
    public String model; //Model
    int mileage;
    int passengersCount; //Quantity of the passengers
    public int tankVolume; //Available tank capacity
    public int fuelConsumption; //Amount of the fuel consumption in Liter per 100 km
    int maxSpeed;
    public int weightAuto; //Total weight of the Auto
    public int carriageCapacity; //How many kilo this car is capable to carry

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

    public void move() {
        System.out.println("Автомобиль едет и проедет " + tankVolume / fuelConsumption * 100 + " км.");
        System.out.println("Если Автомобиль едет с максимальной скоростью " +maxSpeed+ " то он проедет " + getLenghtMaxSpeed()+ " км.");

        //Метод для расчета веса груза, который может перевезти автомобиль
    }

    public int getCountCargo() {
        return carriageCapacity - weightAuto;
    }

    public int getMaxPassengersCount() {
        return getCountCargo() / 100;
    }

    private double getLenghtMaxSpeed() {
        return (double) tankVolume / fuelConsumption * 100 * 0.8;
    }
}
