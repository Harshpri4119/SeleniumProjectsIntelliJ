/*
The first example program shows you the usage of in-line initializers
 instead of using a constructor to initialize the attributes of a sphere.
In line initializing help us to easily assign initial values for our instance variables.⠀
* */

class InitializerVariable{
    double radius = 0.5;
    double mass = 0.4;
    String color = "White";

    public void printValues(){
        System.out.print(" Radius :: " + radius);
        System.out.print(" Mass :: " + mass);
        System.out.print(" Color :: " + color);
    }
}
class Example1{
    public static void main(String[] args) {
        InitializerVariable i = new InitializerVariable();
        i.printValues();
    }
}