
/*

        *** NORMAL CLASS CREATION ***

// this is a class of pen type here we describe the property of pen means structure 
class pen{
    String color;
    String type;

    public  void penColor() {

        // this keyword use to acess the property of current class

        System.out.println(this.color);
        System.out.println(this.type);
    }
}
 */


// CONSTRUCTOR CONCEPT=>it's just like a function 

class Student{
    String name;
    int age;

   public void information() {
        System.out.println(this.name);
        System.out.println(this.age);
   }
/*if we dont creat constructor then java bydefault creat constructor and then run the code
   
                        *** RULE OF CONSTRUCTOR ***

    (1)=>the name of constructor and the class name must be same
    (2)=>don't return anything
    (3)=> it can not call multiple time ,just call one time.

    */

   /*
            *** SIMPLE CONSTRUCTOR***
    Student(){
        // this is constructor without paremetar . it extiquton first 
        System.out.println("when the obj creat at that moment the constructor called");
    }

    */

    
/*
        *** CONSTRUCTOR WITH PAREMETAR***

        Student(String nam, int boyos){
        // this is paremetarsie constructor .here assign the data with the property

        this.name=nam;
        this.age= boyos;
        System.out.println(" I AM FIRST ");
        }
 */

            // COPY CONSTRUCTOR

    Student(Student s2){
        //here copy the data of s1 to s2
        this.name=s2.name;
        this.age=s2.age;
        System.out.println("I AM COPPY NUMBER 2 ");
    }

    Student(){
        // if we don't declar it then ot run the code
        System.out.println(" I AM FIRST S1");
    }

}



public class oops{
    public static void main(String[] args) {

        /*

                *** THIS IS SIMPLE OOPS CONCEPT ***

        pen pen1=new pen();//using new keyword creat the object of pen .pen1 is object
        pen1.color="blue";// using dot(.) operator we can acess the property of the class
        pen1.type="gel";

        pen1.penColor();// here we called the method 

        pen pen2=new pen();// object number two
        pen2.color="black";
        pen2.type="use n through";
        pen2.penColor();// called the method using obj2


        */

                            // SIMPLE CONSTRUCTOR 

        //Student s1=new Student();//creat obj
        //s1.name="Bidyut";
        //s1.age=22;
        //s1.information();

                    // CONSTRUCTOR WITH PAREMETAR 

        //Student s2=new Student("BILLU",20);
        //s2.information();


                        // COPY CONSTRUCTOR
        Student s1=new Student();
        s1.name="DJ";
        s1.age=18;
        Student s2=new Student(s1);
        s2.information();

    }
}