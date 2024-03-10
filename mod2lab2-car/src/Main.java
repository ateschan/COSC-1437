//Addison Teschan
//January 29, 2024
//Car
//The car class will encapsulate the attributes of a car with a drive function.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String brand,model;
        int year;
        double mileage;

        //Using parameterized constructors vs using setters. Does the same thing.
        System.out.println("What is the brand of the car?");
        brand = scan.nextLine();
        System.out.println("What is the model of the car?");
        model = scan.nextLine();
        System.out.println("What is the year of the car?");
        year = scan.nextInt();
        System.out.println("What is the Mileage of the car?");
        mileage = scan.nextDouble();

        Car myCar = new Car(brand, model, year, mileage);

        System.out.println(
                "The brand of your car was: " + myCar.getBrand()
                + "\nThe model of your car was: " + myCar.getModel()
                + "\nThe year of your car was: " + myCar.getYear()
                + "\nThe mileage of your car was: " + myCar.getMileage()
        );

        System.out.println("How many miles would you like to drive?");
        myCar.drive(scan.nextDouble());
        System.out.println("Your new mileage is: " + myCar.getMileage());

        scan.close();
    }
}