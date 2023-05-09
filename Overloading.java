/*Creating a class with same two mthod name to see overloading */
class add{
    static int sum(int a, int b){
        return (a+b);
    }
    static int sum (int a, int b, int c){
        return (a+b+c);
    }
}
public class Overloading {
    public static void main(String[] args) {
        add obj=new add();
        System.out.println(obj.sum(5,5));
        System.out.println(obj.sum(5,5,5));  
    }
}
