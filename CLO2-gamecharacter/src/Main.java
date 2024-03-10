//Addison Teschan
//Feb 22 2024
//Videogame and game studio assignment


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Character character = new Character();
        Videogame videogame = new Videogame();
        Gamestudio gamestudio = new Gamestudio();

        System.out.println("What is the character name?");
        character.setCharacterName(scan.nextLine());
        System.out.println("What is the character type?");
        character.setCharacterType(scan.nextLine());
        System.out.println("What is the character's hitpoints?");
        character.setHitpoints(scan.nextInt());
        scan.nextLine();
        System.out.println("What is the game title");
        videogame.setGameName(scan.nextLine());
        System.out.println("What is the game genre?");
        videogame.setGenre(scan.nextLine());
        System.out.println("What is the game studio's name?");
        gamestudio.setStudioName(scan.nextLine());
        System.out.println("Where is the game studio located?");
        gamestudio.setLocation(scan.nextLine());

        videogame.setMainCharacter(character);
        gamestudio.setPublishedGame(videogame);

        System.out.println(
                 "\nThe character's name is " + gamestudio.getPublishedGame().getMainCharacter().getCharacterName()
                +"\nThe character's type is " + gamestudio.getPublishedGame().getMainCharacter().getCharacterType()
                +"\nThe character's hitpoints are " + gamestudio.getPublishedGame().getMainCharacter().getHitpoints()
                +"\nThe game title is " + gamestudio.getPublishedGame().getGameName()
                +"\nThe game genre is " + gamestudio.getPublishedGame().getGenre()
                +"\nThe studio name is " + gamestudio.getStudioName()
                +"\nThe studio location is " + gamestudio.getLocation()
        );
    }
}