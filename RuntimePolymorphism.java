// runtime polymorphism method over writing 

class Animal {
  void makeSound(){
    System.out.println("Animals makes sound");
  }
  
}
class Dog extends Animal{
  void makeSound(){
    System.out.println("Dog barks");
  }
}
class Cat extends Animal{
  void makeSound(){
    System.out.println("cat meows");
  }
}

public class RuntimePolymorphism {
  public static void main(String[] args) {
    Animal a;
    a =  new Dog();
    a.makeSound();

    a= new Cat();
    a.makeSound();
  }
}
