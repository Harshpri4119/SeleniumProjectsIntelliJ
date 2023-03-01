package com.java.Inheritence.MultipleInheritance;

// Multiple inheritance in the java interface is supported.
// since it just dec the methods but not implements it as Java Classes.
// See below you wont see any code error unlike Java Class Multiple Inheritance

interface Program1interface {
    void m1();
}
interface Program2interface {
    void m1();
}
interface TestInterface extends Program1interface,Program2interface{

}
