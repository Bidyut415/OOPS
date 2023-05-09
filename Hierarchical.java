// hierarchical inheritance
class Father{
    int money=100000;
}
class Son extends Father{

}
class Daughter extends Father{

}

public class Hierarchical {
    public static void main(String args[])
    {
        Son s=new Son();
        Daughter d=new Daughter();
        System.out.println("BAP ka mal for son:=>"+s.money);
        System.out.println("Bap ka mal for Daughter:=>"+d.money);
    }
}
/*in hierarchical inheritance there is one parent class and many child class  */
