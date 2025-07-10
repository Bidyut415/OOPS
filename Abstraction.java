// abstarction class 
abstract class Payment {

  //abstract method must be use in child classes
  abstract void pay(double amount);

  // common method shared logic
  void printRecipt(double amount){
    System.out.println("processing payment of " + amount + " complete");
  }
}
// make a class of card payment 
class CreditPayment extends Payment  {
  void pay(double amount){
    System.out.println("credit card payment of " + amount);
    printRecipt(amount);
  }
  
}
// make class of upi payment
class UpiPayment extends Payment {
  void pay(double amount){
    System.out.println("UPI payment of " + amount);
    printRecipt(amount);
  }
}
  
public class Abstraction {
  public static void main(String[] args) {
    //payment is reference type of abstarct class Payment
    Payment P;
    P =new CreditPayment();
    P.pay(50000);

    P = new UpiPayment();
    P.pay(10000);

  }
}
