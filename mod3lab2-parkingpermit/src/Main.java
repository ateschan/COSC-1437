//Addison Teschan
//Feb 18 2024
//perkingpermit student program uses classes to make objects
//EDIT: Forgot to use my copy constructors - Feb 21 2024


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstname, lastname, street, city, state, zip, make, model, year;

        Header.welcome();

        System.out.println("What is your firstname?");
        firstname = scan.nextLine();
        System.out.println("What is your lastname?");
        lastname = scan.nextLine();
        System.out.println("What is your street?");
        street = scan.nextLine();
        System.out.println("What is your city?");
        city = scan.nextLine();
        System.out.println("What is your state?");
        state = scan.nextLine();
        System.out.println("What is your zip?");
        zip = scan.nextLine();
        System.out.println("What is your car make?");
        make = scan.nextLine();
        System.out.println("What is your car model?");
        model = scan.nextLine();
        System.out.println("What is your car year?");
        year = scan.nextLine();

        ParkingPermit permit = new ParkingPermit(make, model, year);
        Address addr = new Address(street, city, state, zip);
        Student stu = new Student(firstname, lastname, addr, permit);

        System.out.println(
                "\nFirst: " + stu.getFirstName() + "\nLast: " + stu.getLastName() + "\nAddress: " + stu.getAddr().getStreet()+ " " + stu.getAddr().getCity() + " " + stu.getAddr().getState() + " " + stu.getAddr().getZip() + " " + "\nPermit: " + stu.getPermit().getCarMake() + " " + stu.getPermit().getCarModel() + " " + stu.getPermit().getCarYear()
        );

    }
}