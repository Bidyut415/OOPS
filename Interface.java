// create inteface and test it 
 interface Animal {
  void eat();// this is the interface 
  void sleep();
  void sound();
}
// here we use the interface 
class Dog implements Animal{
  public void eat(){
    System.out.println("Dog eats meat");
  }
  public void sleep(){
    System.out.println("Dog sleep in the night ");
  }
  public void sound(){
    System.out.println("Dog souns like Geou geou");
  }
}
class Cat implements Animal {
  public void eat(){
    System.out.println("cat eat milk");
  }
  public void sound(){
    System.out.println("cat sound like moow");
  }
  public void sleep(){
    System.out.println("cat sleep in the morning");
  }
}
public class Interface {
  public static void main(String[] args) {
    Animal a = new Dog();
    a.eat();
    a.sleep();
    Animal a2 =new Cat();
    a2.eat();
    a2.sound();
  }
}
