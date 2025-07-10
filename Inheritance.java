class Animal {// this is the super class
  void eat(){
    System.out.println("This animal eats food");
  }
}
class Dog extends Animal{// this is sub class
  void bark(){
    System.out.println("Dog barks");
  }
}
public class Inheritance {
  public static void main(String[] args) {
    Dog d =new Dog();
    d.eat();
    d.bark();
  }
}
