package com.example.lib;

public class TruckVehicleSubClass extends Vehicle implements VehicleInterface{


    public TruckVehicleSubClass(int numberOfWheels){
        super(numberOfWheels);
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void accelerate() {

    }

    public void brake(){
    }

    void start(){
        System.out.println("The Truck starts");
    }
}
