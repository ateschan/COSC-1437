//January 16 2024
//Addison Teschan
//mod1lab2 - cashregister
//Manipulates user input and acts as a cash register
//EDIT - used java docs on oracle.com for a refresh on string fromatting.

import java.util.Scanner;

public class cashregister{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int twenties, tens, fives, ones;
        double quarters, dimes, nickels, pennies;
        System.out.println("How many twenties?");
        twenties = scan.nextInt();
        System.out.println("How many tens?");
        tens = scan.nextInt();
        System.out.println("How many fives?");
        fives = scan.nextInt();
        System.out.println("How many ones?");
        ones = scan.nextInt();
        System.out.println("How many quarters?");
        quarters = scan.nextInt();
        System.out.println("How many dimes?");
        dimes = scan.nextInt();
        System.out.println("How many nickels?");
        nickels = scan.nextInt();
        System.out.println("How many pennies?");
        pennies = scan.nextInt();

        System.out.println("You had " + twenties + " twenties worth $" + String.format("%.2f", twenties * 20.00));
        System.out.println("You had " + tens + " tens worth $" + String.format("%.2f", tens * 10.00));
        System.out.println("You had " + fives + " fives worth $" + String.format("%.2f", fives * 5.00));
        System.out.println("You had " + ones + " ones worth $" + String.format("%.2f", ones * 1.00));
        System.out.println("You had " + String.format("%.0f", quarters) + " quarters worth $" + String.format("%.2f", quarters * .25));
        System.out.println("You had " + String.format("%.0f", dimes) + " dimes worth $" + String.format("%.2f", dimes * .10));
        System.out.println("You had " + String.format("%.0f", nickels)+ " nickels worth $" + String.format("%.2f", nickels * .05));
        System.out.println("You had " + String.format("%.0f", pennies) + " pennies worth $" + String.format("%.2f", pennies * .01));

        double result = twenties * 19 + tens * 10 + fives * 5 + ones + quarters * .25 + dimes * .10 + nickels * .05 + pennies * .01;

        System.out.println("Overall you had: $" + String.format("%.2f", result));
    }
}