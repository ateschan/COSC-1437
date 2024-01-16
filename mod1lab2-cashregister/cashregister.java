//January 16 2024
//Addison Teschan
//mod1lab2 - cashregister
//Manipulates user input and acts as a cash register


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

        System.out.println("You had " + twenties + " twenties worth $" + twenties * 20);
        System.out.println("You had " + tens + " tens worth $" + tens * 10);
        System.out.println("You had " + fives + " fives worth $" + fives * 5);
        System.out.println("You had " + ones + " ones worth $" + ones);
        System.out.println("You had " + quarters + " quarters worth $" + quarters * .25);
        System.out.println("You had " + dimes + " dimes worth $" + dimes * .10);
        System.out.println("You had " + nickels + " nickels worth $" + nickels * .05);
        System.out.println("You had " + pennies + " pennies worth $" + pennies * .01);


        System.out.println("Overall you had $" + (twenties * 20 + tens * 10 + fives * 5 + ones + quarters * .25 + dimes * .10 + nickels * .05 + pennies * .01));
    }
}