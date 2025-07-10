 class Person {
  private String name;// set the variable as private /hidden frome out side

  public void setName(String n){
    name=n;// set the name Hare
  }

  public String getName(){
    return  name;// fetch the name here 
  }
}
public class Encapsulation {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("Bidyut");
    System.out.println(p1.getName());
  }
}
