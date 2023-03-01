//
// *The second example program is about the execution order.
// We know that a proper constructor gets executed at the point of creating a new object.
// But before the execution of the constructor body all instance variable initializers in the object will be executed.
// Therefore if we assign a value to an instance variable using a constructor
// and if that same variable was assigned a value through in-line initializing too, the value assigned using the constructor will be its final value.
// This is because the constructor runs after the in-line initializers.
// This is the reason why the output shows the values assigned by the constructor in the second program.
// */

class InitializerVariable2 {
    InitializerVariable2(){
        radius = 0;
        mass = 0;
        color = null;
    }
    double radius = 0.45;
    double mass = 0.87;
    String color = "Orange";
    public void printValues() {
        System.out.println(" Radius :: " + radius);
        System.out.println(" Mass :: " + mass);
        System.out.println(" Color :: " + color);
    }
}
class Example2{
    public static void main(String[] args) {
         InitializerVariable2 i = new InitializerVariable2();
        i.printValues();
    }
}
