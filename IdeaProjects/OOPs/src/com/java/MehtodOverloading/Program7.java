package com.java.MehtodOverloading;


class Animal{         // Parent Class

}
class Dog extends Animal{  // Child Class

}

class Program7 {     //  Main Class

    public void m1(Animal animal){

        System.out.println(" Animal Version. ");

    }

    public void m1(Dog dog){

        System.out.println(" Dog Version. ");
    }

    public static void main(String[] args){

        Program7 program7 = new Program7();

        Animal a = new Animal();     // Animal Ref and Animal Obj   -> Parent Ref and Obj
        Dog d = new Dog();           // Dog Ref and Dog Obj         -> Child Ref and Obj
        Animal a1 = new Dog();       // Animal Ref and Dog Obj      -> Parent Ref and Child Obj

        program7.m1(a);              //  Animal Version
        program7.m1(d);              // Dog Version
        program7.m1(a1);             // Animal Version , Because we used the Animal Ref and ((( Java Compiler Considers only Ref not Run Time Obj. )))

    }
}
