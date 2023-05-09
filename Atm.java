import java.util.Scanner;
import java.util.*;

class MainAtm{
    int pin=758583;
    float amount;

    public void checkPin(){
        System.out.println("ENTER YOUR PIN");
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(pin==enterpin){
            menu();
        }
        else{
            System.out.println("YOU ENTER WRONG PIN");
            menu();
        }

    }
    public void menu(){
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.Check A/C Blance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkBlance();
        }
        else if(opt==2){
            withdrawMoney();
        }else if(opt==3){
            depositMoney();
        }else if(opt==4){
          return;  
        }
        else{
            System.out.println("ENTER A VALID CHOICE");
        }
    }

    public void checkBlance(){
        System.out.println("YOUR BLANCE "+ " "+amount);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw");
        Scanner sc=new Scanner(System.in);

        float money=sc.nextFloat();
        if(money>amount){
            System.out.println("Insufficient Money");
        }
        else{
         amount=amount-money;
         System.out.println("money withdraw sucessfully =>"+" "+money);   
        }

        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount");
        Scanner sc=new Scanner(System.in);
        float money=sc.nextFloat();

        amount=amount+money;
        System.out.println("money deposit succfully");
        menu();
    }
}

public class Atm {
    public static void main(String[] args) {
        MainAtm obj=new MainAtm();
        obj.checkPin();
    }
}
