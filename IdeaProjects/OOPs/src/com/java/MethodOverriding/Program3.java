package com.java.MethodOverriding;

// Method Over riding Rule 2::
// up To Java 1.4V , Return Types should be same for the Parent and Class.
// from Java 1.5V, Return Types can be different for Both Parent and Class , its called Co Variant Return Types.

// Below we changed return types of methods from obj to string in parent and child.

class ParentReturn{

    public Object m1(){     // Object return type used in parent over ridden method
        return null;
    }
}
class ChildReturn extends ParentReturn{

    public String m1(){     // String return type used in child over riding method.

        return null;

    }
}
public class Program3 {
    public static void main(String[] args){

        ParentReturn parentReturn = new ParentReturn();
        parentReturn.m1();

        ChildReturn childReturn = new ChildReturn();
        childReturn.m1();

        ParentReturn parentReturn1 = new ChildReturn();
        parentReturn1.m1();
    }
}
