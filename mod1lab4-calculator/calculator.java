//Addison Teschan
//January 16 2024
//Calculator
//Cli tool that needs add subtract multiply divide functionality


import java.util.Scanner;

public class calculator {

    public static void main(String[] args){
        double output = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number?");
        int firstNum = scan.nextInt();
        System.out.println("What is the second number?");
        int secondNum = scan.nextInt();

        int sum = firstNum + secondNum;
        int diff = firstNum - secondNum;
        int product = firstNum * secondNum;
        double quotient = (double) firstNum / secondNum;

        System.out.println("The sum of " + firstNum + " + " + secondNum + " = " + sum + "." );
        System.out.println("The difference of " + firstNum + " - "+ secondNum + " = " + diff + "." );
        System.out.println("The product of " + firstNum + " x "+ secondNum + " = " + product + ".");
        System.out.println("The quotient of " + firstNum + " / "+ secondNum + " = " + String.format("%.2f", quotient) + ".");
    }
}
