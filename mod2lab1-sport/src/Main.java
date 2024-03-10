//Addison Teschan
//January 12, 2024,
//Sport
//The sport class will encapsulate the attributes of a sports team.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int NumberOfPlayers, SeasonWins, SeasonLosses;
        String name;

        System.out.println("What is the name of your new team?");
        name = scan.nextLine();
        System.out.println("How many players are on your team?");
        NumberOfPlayers = scan.nextInt();
        System.out.println("How many wins?");
        SeasonWins = scan.nextInt();
        System.out.println("How many losses?");
        SeasonLosses = scan.nextInt();

        //Calling the constructor with parameters
        Sport team = new Sport(name, NumberOfPlayers, SeasonWins, SeasonLosses);

        //Output
        System.out.println("On the " + team.getName() +
                        " \nThe number of players were " + team.getNumberOfPlayers() +
                        " \nThe number of wins were " + team.getSeasonWins() +
                        " \nThe number of losses were " + team.getSeasonLosses() +
                        " \nThe win loss ratio is " + String.format("%.0f", team.winLoss()) + "%");

        scan.close();
    }
}