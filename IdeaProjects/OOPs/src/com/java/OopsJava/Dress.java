package com.java.OopsJava;
//  Q :: Create class and declare abstract method.
// >> then create Child class and implement the abstract method.
// >> then create class and print the return types of the object.
public abstract class Dress {
//    public abstract String getDressCategories();
}
class Gents extends Dress{
    public String getDressCategories(){
        return "Shirts, Pants , T-Shirts, Trousers";
    }
}
class Ladies extends Dress{
//    @Override
    public String getDressCategories() {
        return " Sarees, Jeans, Leggings, Chudidhars, Night Ware";
    }
}
class Kids extends Dress{
//    @Override
    public String getDressCategories() {
        return " Shirts, Pants, T-Shirts, Frock, Skirts " ;

    }
}
class DressCategories{
    public static void main(String[] args) {
        Gents gents = new Gents();
        Ladies ladies = new Ladies();
        Kids  kids = new Kids();
        System.out.println(" Dress Category For Gents, Ladies, Kids :: ");
        System.out.println(" ");
        System.out.println(" ============================================");
        System.out.println(" ");
        System.out.println(" Gents Category :: " + gents.getDressCategories());
        System.out.println(" Ladies Category :: " +  ladies.getDressCategories());
        System.out.println(" Kids Category :: " + kids.getDressCategories());
    }
}
