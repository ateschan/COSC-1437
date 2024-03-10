//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Addison Teschan CLO 5
//March 8 2024
//Playing with parallel arrays
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void showAllContacts(String[] fname, String[] lname, String[] email, String[] phone){
        for (int i = 0; i < 5; i++){
            System.out.println(
                    "Person #" + i +
                    "\nFirstname: " + fname[i] +
                    "\nLastname: " + lname[i] +
                    "\nEmail: " + email[i] +
                    "\nPhone #: " + phone[i]
            );
        }
        printHeader();
    }

    public static void lastNameSearch(String[] fname, String[] lname, String[] email, String[] phone){
        System.out.println("What is the last name you want to search for?");
        String input = scan.nextLine();

        for (int i = 0; i < 5; i++){
            if (lname[i].equals(input)){
                System.out.println(
                        "Person #" + i +
                                "\nFirstname: " + fname[i] +
                                "\nLastname: " + lname[i] +
                                "\nEmail: " + email[i] +
                                "\nPhone #: " + phone[i]
                );
                printHeader();
                return;
            }
        }
        System.out.println("No matches were found...");
        printHeader();
    }

    public static void firstNameSearch(String[] fname, String[] lname, String[] email, String[] phone){
        System.out.println("What is the first name you want to search for?");
        String input = scan.nextLine();

        for (int i = 0; i < 5; i++){
            if (fname[i].equals(input)){
                System.out.println(
                        "Person #" + i +
                                "\nFirstname: " + fname[i] +
                                "\nLastname: " + lname[i] +
                                "\nEmail: " + email[i] +
                                "\nPhone #: " + phone[i]
                );
                printHeader();
                return;
            }
        }
        System.out.println("No matches were found...");
        printHeader();
    }


    public static void printHeader(){
        System.out.println(
                "Welcome to my parallel array system!" +
                        "\nEnter 1 to show all contacts" +
                        "\nEnter 2 to search based on last name" +
                        "\nEnter 3 to search based on first name" +
                        "\nEnter 4 to quit program"
        );
    }

    public static void main(String[] args) {
        String[] firstname = {"Mike", "Bike", "Nike", "Pike", "Jordan"};
        String[] lastname = {"Gorgle", "Borgle", "Norgle", "Shmorgle", "Johnson"};
        String[] email = {"mikegorgle@aol.com", "bikeborgle@aol.com", "nikenorgle@aol.com", "piksmhmorgle@aol.com", "jordanjohnson@aol.com"};
        String[] phone = {"7072134823", "1839284392", "3940193859", "1394829384", "1937852932"};

        printHeader();
        while (true){
            int input = scan.nextInt();
            scan.nextLine();
            switch (input){
                case 1:
                    showAllContacts(firstname,lastname,email,phone);
                    break;
                case 2:
                    lastNameSearch(firstname,lastname,email,phone);
                    break;
                case 3:
                    firstNameSearch(firstname,lastname,email,phone);
                    break;
                case 4:
                    exit(0);
                    break;
            }
        }
    }
}