/* CONSTRUCTOR  */

class Employee {
    String name;
    int id;
    String department;

    //  1. Default Constructor
    Employee() {
        this("Unknown", 0, "General"); //  2. Constructor chaining using this()
        System.out.println("Default constructor called");
    }

    //  2. Parameterized Constructor
    Employee(String name, int id, String department) {
        this.name = name;            //  3. Using this to refer to current object
        this.id = id;
        this.department = department;
        System.out.println("Parameterized constructor called");
    }

    //  3. Copy Constructor (manually created)
    Employee(Employee other) {
        this.name = other.name;
        this.id = other.id;
        this.department = other.department;
        System.out.println("Copy constructor called");
    }

    //  4. Method for printing
    void printDetails() {
        System.out.println("Name: " + this.name);      //  Using this to refer to instance variable
        System.out.println("ID: " + this.id);
        System.out.println("Department: " + this.department);
    }

    //  5. Returning current object for method chaining
    Employee updateDepartment(String dept) {
        this.department = dept;
        return this; //  Returning current object
    }

    //  6. Passing current object as argument
    void compare(Employee emp) {
        if (this.id == emp.id) {
            System.out.println("Same ID: " + id);
        } else {
            System.out.println("Different employees");
        }
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("----- Default Constructor -----");
        Employee e1 = new Employee();        // Default constructor
        e1.printDetails();

        System.out.println("\n----- Parameterized Constructor -----");
        Employee e2 = new Employee("Bidyut", 101, "IT");  // Parameterized
        e2.printDetails();

        System.out.println("\n----- Copy Constructor -----");
        Employee e3 = new Employee(e2);     // Copy constructor
        e3.printDetails();

        System.out.println("\n----- Method Chaining with Constructor -----");
        e3.updateDepartment("Cybersecurity").printDetails();  // Method chaining

        System.out.println("\n----- Passing Current Object to Method -----");
        e2.compare(e3);  // Passing current object to method
    }
}
