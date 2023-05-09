// Access modifiers is nothing but some basic concept of oops.it is four types(1)=>public
//(2)=>private(3)=>protected(4)=>default
/*(1)public=>if a variabel or any method set in public mode then it can eassyly access form
any where in the program.
(2)private=>in private mode a variabel can access in the same class or in same package
(3)procted=>in procted mode if a variabel set then it can not access form any it can access
only form getter and settr method
(4)default=>it is same as public if we don't declar any thing then it is in public mode */
 
class Boys{
    public String mon;
    private String girlfrnd="naikhe(private)";
    protected String Girlfrndname;
    String ami;

     Boys() {// it's now a constructor 
        System.out.println(this.girlfrnd);//private only access in same class
    }
    //use of getter and setter
    public String getName(){
        return this.Girlfrndname;//form we return the nam
    }
    public void setName(String nam){
        this.Girlfrndname=nam;// form we set the nam
    }
}

public class Accessmodifiers { 
  public static void main(String args[]){
    // the main method alwys declar in public mode because of it can access form any where 
    Boys b1=new Boys();

    b1.mon="sobar jonny(public)";//it is public so we can access

   // b1.girlfrnd="it's private";//form we can not access the private because it access only
    // form the same class only if want to use then use form the class boys.

    b1.ami="ai ta ami chiro single(default)";//default part 

    System.out.println(b1.mon);//public
    System.out.println(b1.ami);//default

    b1.setName("keo nai(procted)");
    System.out.println(b1.getName());

  }  
}
