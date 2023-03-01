public class Notes {
    public static void main(String[] args){
        String siblingSyntax = "//*[@id='attribute']/following-sibling::attribute[numberIdentifier_of_valuePath]";
        String parentSyntax = "//*[@id='attribute']/parent::parentAttribute";

        System.out.println(" Parent to Child Syntax is :: " + siblingSyntax);
        System.out.println(" Child to Parent Syntax is :: " + parentSyntax );
    }
}
