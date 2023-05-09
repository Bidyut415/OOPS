    // POLYMORPHISM OF COMPILE TIME

/*in polymorphism the method name is same but the funcanality of the method change 
 * this concept is called polymorphism .
 * 
 * TO CREAT POLYMORPHISM METHOD HAVE SOME RULE
 * (1)=>method name is same have to some change in the method,like(a)=>change return type
 * (b)=>change the paremetar,(c)=>also change the number of argument in paremetar
 * 
 * some example shown in the bellow
 */

class Teacher{
    String name;
    int age;
    
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="Bidyut";
        t1.age=22;
        t1.printInfo(t1.name);
        /* the method name is same but the funcanility of the every method is different */
    }
}
