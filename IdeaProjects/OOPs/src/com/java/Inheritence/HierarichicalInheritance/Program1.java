package com.java.Inheritence.HierarichicalInheritance;

// Hierarichical Inheritance :: When Mulitple Child Classes is extended by the Single Parent Class
// Then it is Known as Hierarical Inheritance.
// It is Supported by Java.
// Eg :: Class B -> Class A <- Class C
// Its Also Called as Reverse of the Multiple Inheritance.


class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        d.eat();
        d.bark();
        c.meow();
        c.eat();
        //c.bark();//C.T.Error
    }
}