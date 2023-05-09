
/*INHERITANCE := it has four types  */
/*here we discuss about simple or single inheritance */
class father{
    String sirname="MAJHI";
}
class son extends father{
    String name="BIDYUT";
}

public class Inheritance {
    public static void main(String args[])
    {
        son s= new son();
        System.out.println("sir name of son come form father"+" "+s.sirname);
        System.out.println("the name is present in the son "+" "+s.name);
    }
}
/*this is single inheritance means here one parent class and one child class present the 
 * child class can acess all the property of parent class.
 */
