//Addison Teschan
//January 29, 2024
//House
//The house class will encapsulate the attributes of a house that can calculate square footage.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String address;
        int numBedrooms, squareFeet;
        double numBathrooms, price;

        System.out.println("What is the address?");
        address = scan.nextLine();
        System.out.println("What is the num of bedrooms?");
        numBedrooms = scan.nextInt();
        System.out.println("What is the num of bathrooms?");
        numBathrooms = scan.nextDouble();
        System.out.println("What is the square feet?");
        squareFeet = scan.nextInt();
        System.out.println("What is the price?");
        price = scan.nextDouble();

        House myHouse = new House(address,numBedrooms,squareFeet,numBathrooms,price);

        System.out.println(
                "The address of your house was: " + myHouse.getAddress()
                + "\nThe # of bedrooms was: " + myHouse.getNumBedrooms()
                + "\nThe # of bathrooms was: " + myHouse.getNumBathrooms()
                + "\nThe square footage was: " + myHouse.getSquareFeet()
                + "\nThe overall price of the house was: $" + myHouse.getPrice()
        );

        System.out.println("\nThe price per square foot was: $" + String.format("%.2f", myHouse.calculatePricePerSqFt()));

        scan.close();
    }
}