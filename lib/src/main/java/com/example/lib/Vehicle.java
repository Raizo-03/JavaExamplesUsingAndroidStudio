package com.example.lib;

//Parent class
public abstract class Vehicle {
    int numberOfWheels;

    public Vehicle(int NumberofWheels){
        this.numberOfWheels = NumberofWheels;
    }

    abstract void brake();
    void start(){
        System.out.println("The Vehicle Starts");
    }
    void stop(){
        System.out.println("The Vehicle Stops");
    }


}
