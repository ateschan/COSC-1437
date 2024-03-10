//Addison Teschan
//Mar 7 2024
//Manipulates the videogame class

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static VideoGame addGame(){
        String title, genre, platform;
        double price;
        System.out.println("What is the title?");
        title = scan.nextLine();
        System.out.println("What is the genre?");
        genre = scan.nextLine();
        System.out.println("What is the platform?");
        platform = scan.nextLine();
        System.out.println("What is the price?");
        price = scan.nextDouble();
        System.out.println();
        System.out.println("Game added!");
        printHeader();
        return new VideoGame(title, genre, platform, price);
    }

    public static void displayInventory(ArrayList<VideoGame> arr){
        for (VideoGame game : arr){
            System.out.println(game);
        }
        System.out.println("Inventory Displayed!");
        printHeader();
    }

    public static void searchByTitle(ArrayList<VideoGame> arr){
        System.out.println("Enter title: ");
        String input = scan.nextLine();
        for (VideoGame game : arr){
            if (game.getTitle().equals(input)){
                System.out.println(game);
            }
            System.out.println("Searched by title!");
            printHeader();
        }
    }

    public static void searchByPlatform(ArrayList<VideoGame> arr){
        System.out.println("Enter Platform: ");
        String input = scan.nextLine();
        for (VideoGame game : arr){
            if (game.getPlatform().equals(input)){
                System.out.println(game);
            }
            System.out.println("Searched by platform!");
            printHeader();
        }
    }

    public static void printHeader(){
        System.out.println("1: add a game");
        System.out.println("2: display inventory");
        System.out.println("3: search by title");
        System.out.println("4: search by platform");
        System.out.println("5: exit with code 0");
    }

    public static void main(String[] args) {
        ArrayList<VideoGame> arr = new ArrayList<VideoGame>();
        printHeader();
        while (true){
            int input = scan.nextInt();
            scan.nextLine();
            switch (input){
                case 1:
                    arr.add(addGame());
                    break;
                case 2:
                    displayInventory(arr);
                    break;
                case 3:
                    searchByTitle(arr);
                    break;
                case 4:
                    searchByPlatform(arr);
                    break;
                case 5:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}