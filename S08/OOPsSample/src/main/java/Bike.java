package main.java;

public class Bike extends Appliance implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }

    @Override
    public void turnOn() {
        System.out.println("Bike is turned on");
    }
}
