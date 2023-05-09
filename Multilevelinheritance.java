// MULTILEVEL INHERITANCE
class Dadu{
    int taka=1000;
}
class Baba extends Dadu{
    int money=2000;
}
class Ami extends Baba{
    int poysa=30000;
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        Ami a=new Ami();
        System.out.println("Dadu dilo:=>"+a.taka);
        System.out.println("Baba dilo:=>"+a.money);
        System.out.println("amr nijer ache:=>"+a.poysa);
        
    }
}
/*here form ami class i can access all the properyt of dadu and father and also my own
 * here we have to change the variabel name difference in every class otherwise the value
 * of last class will assign in every variabel.
 */
