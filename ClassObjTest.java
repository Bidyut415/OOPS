import java.util.*;

class Person{
  String name;
  int age;

  void Hello(){
    System.out.println("Hello my name is " + name +" " + "and i am "+ age);
  }
}
public class ClassObjTest {
  public static void main(String[] args) {

    Person p1 = new Person();
    p1.name="bidyut";
    p1.age=22;
    p1.Hello();
  }
}
