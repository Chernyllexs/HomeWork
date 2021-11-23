package com.java.october.fest.task.Horstmann.chapter_2;

public class Car {
    private double fuelVolume = 0.0d;
    private final double fuelConsumption;
    private double distanceMoved = 0.0d;

    public Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double distance) {
        double possibleDistance = fuelConsumption * fuelVolume;
        if (Double.compare(possibleDistance, distance) >= 0) {
            fuelVolume -= distance / fuelConsumption;
            distanceMoved += distance;
            System.out.format("Drove %f miles\n", distanceMoved);
        } else
            System.out.println("Not enough fuel");
    }

    public void refuel(double fuelVolume) {
        this.fuelVolume += fuelVolume;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public double getDistanceMoved() {
        return distanceMoved;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel left=" + fuelVolume +
                ", fuel consumption=" + fuelConsumption +
                ", distance moved=" + distanceMoved +
                '}';
    }
}
