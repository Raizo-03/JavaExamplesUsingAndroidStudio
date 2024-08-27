package com.example.lib;

public class MyClass {
    //main method
    public static void main (String[] args){


        printPrimitiveVariables();

        printNonPrimitiveVariables();

    }

    public static void println(String e){
        System.out.println(e);
    }


    //Variables
    public static void printPrimitiveVariables(){
        //Primitive Data Types
        //Int Variables
        /*
        Accepts integer/whole numerical value
        Byte = -128 to 127
        Short = -32, 768 to 32,767 = needs casting
        Int = 2 million
        Long = 9 million
         */

        Byte count = 10;
        int age = 5;
        short nums =  32767;
        long millions = 100000000;

        //Float Vars
        /*
        Float = precision up to 6 to 7 decimal
        Double = precision up to 15 to 16 decimals
         */

        float Pi= 3.14f;
        double circumference = 3.130D;


        //Char
        /*
        Printing character 0 - 255
         */
        char a = 'n';
        char tab=  '\t';
        char newline = '\n';
        //Boolean vars = holds values of true or false
        boolean choice = false;




        System.out.println(age);
        System.out.println(count);
        System.out.println(nums);
        System.out.println(millions);

        System.out.println(Pi);
        System.out.println(circumference);


        System.out.println(a);

        if(!choice) System.out.println("true");
        else println("False");


    }
    public static void printNonPrimitiveVariables(){
        //Strings = array of char
        //Array = collection of single data type
        //Class = collection of methods

        String name = "Ejay";
        println(name);
        int[] numss = {1, 2, 3};
        for(int i = 0; i <numss.length; i ++){
            System.out.print(numss[i] + " ");
        }
    }

    //TypeCastings
    public static void printTypeCasting(){

    }


}