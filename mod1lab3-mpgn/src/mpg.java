//Addison Teschan
//January 16 2024
//Miles per gallon
//Prompt user for miles driven, and gallons used. Output total miles per gallon.
//
import java.util.Scanner;
class mpg{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of miles driven: ");
        double miles = scan.nextDouble();
        System.out.println("Number of fuel used in gallons: ");
        double gallons = scan.nextDouble();
        System.out.println( Math.round(miles) + " miles " + Math.round(gallons) + " gallons at a rate of " + String.format("%.2f", (miles / gallons)) + " miles per gallon." );
    }
}
