//Addison Teschan
//Feb 21 2024

//Employee assignment now with comments
//EDIT: Added copy constructors, now being used in the employee class.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first, last, userID;
        System.out.println("WELCOME TO THE INFO SYSTEM");
        Benefits benefit = new Benefits("Health", 999.00F, "United Healthcare");
        Address address = new Address("460 Street", "San Antonio", "Texas", "78230");
        System.out.println("What is your firstname?");
        first = scan.nextLine();
        System.out.println("What is your lastname?");
        last = scan.nextLine();
        System.out.println("What is your userID?");
        userID = scan.nextLine();
        Employee myEmployee = new Employee(userID,first,last,benefit,address);
        myEmployee.printEmployee();
    }
}