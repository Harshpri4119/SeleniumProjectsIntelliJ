package com.java.OopsJava;

// Q :: Create class and declare abstract method.
// >> then create Child class and implement the abstract method.
// >> then create class and print the return types of the object.

abstract class Vehicle {
//    public abstract int getWheels();
}
// Sub Class Bus Extends Parent Class Vehicle and Implementing the getWheels() method
class Bus extends Vehicle{
    public int getWheels(){
        return 6;
    }
}

// Sub Class Auto Extends Parent Class Vehicle and Implementing the getWheels() method
class Auto extends  Vehicle{
    public int getWheels(){
        return 3;
    }
}

// Creating the Class and Printing the return values of methods Bus.getWheels(); and Auto.getWheels()
// in the SubClasses
public class VehicleWheels{
    public static void main(String[] args) {
        Bus bus = new Bus();
        Auto auto = new Auto();

        System.out.println(" Bus Wheels :: " + bus.getWheels() );
        System.out.println(" Auto Wheels :: " + auto.getWheels());
    }
}
