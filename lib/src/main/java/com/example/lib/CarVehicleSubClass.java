package com.example.lib;

public class CarVehicleSubClass extends Vehicle implements VehicleInterface{
    String carModel;


    public CarVehicleSubClass(String carModel){
        super(4);
        this.carModel = carModel;
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
        System.out.println("The Car Brakes");
    }
    void start(){
    super.start();
   }

    void honk(){
        System.out.println("The Vehicle Beep Beep");
    }

}
