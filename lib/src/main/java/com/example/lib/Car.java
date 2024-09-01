package com.example.lib;

public class Car {
    //states / attributes
    private int year;
    private int speed;

    public Car(int Year, int Speed){
        this.year = Year;
        this.speed = Speed;
    }
    //Methods
    protected void accelerate(){
        speed+= 10;
        System.out.println("Your new speed is : " + speed);
    }
    public void accelerate(int e){
        speed+= 10;
        System.out.println("Your new speed is : " + speed);
    }

    public void brake(){
        speed -= 5;
        System.out.println("Your new speed is : " + speed);
    }

    //GETTERS AND SETTERS = helper methods
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }


    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
}
