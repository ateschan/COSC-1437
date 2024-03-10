//Addison Teschan
//January 16 2024
//mod1lab1 random number
//Prompt user for floor and ceiling for random number gen
import java.util.Scanner;
import java.util.Random;
//Importing required libs for in/out and random util
public class randnum{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    //Initializing my objects for usage;

    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("Enter first number in the range: ");
    int min = scan.nextInt();
    System.out.println("Enter second number in the range: ");
    int max = scan.nextInt();

    //Init random number
    int randnum =  random.nextInt(min, max);

    //Print output
    System.out.println("Name: " + name);
    System.out.println("Your random number is: " + randnum);
  }
}


