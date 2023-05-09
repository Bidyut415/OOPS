import java.lang.reflect.Method;

/*Creat a parent class to show the overriding method  */
class car{
    void run(){
        System.out.println("Car is running");
    }
}
/*this is child class of car with same method */
class Bike extends car{
    void run(){
        System.out.println("Bike is faster then car");
    }
}
public class Overriding {
    public static void main(String args[]){
        Bike obj=new Bike();
        obj.run();
    }
}
