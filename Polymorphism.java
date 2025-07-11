// Compile time polymorphism (Overloading)
class Calculator{
  
  int add(int a, int b){
    return a+b;
  }
  int add(int a, int b,int c){
    return a+b+c;
  }
  double add(double a, double b){
    return a+b;
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    Calculator sum = new Calculator();
    System.out.println(sum.add(5, 10));
    System.out.println(sum.add(5, 10, 20));
    System.out.println(sum.add(5.10, 10.20));
  }
}
