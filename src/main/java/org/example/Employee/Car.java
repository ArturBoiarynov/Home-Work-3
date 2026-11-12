package org.example.Employee;

public class Car {
    public void start() {
        startElectrecity();
        startCommand();
        startFuelSystem();
        System.out.println("Car started");
    }

    private void startElectrecity() {
        System.out.println("Electricity is on.");
    }

    private void startCommand() {
        System.out.println("Engine start command sent.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started.");
    }
}
