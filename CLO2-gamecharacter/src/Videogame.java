public class Videogame {
    String gameName, genre;
    Character mainCharacter;

    public Videogame(){
        this.gameName = "";
        this.genre = "";
        this.mainCharacter = new Character();
    }

    public Videogame(String gameName, String genre, Character mainCharacter){
        this.gameName = gameName;
        this.genre = genre;
        this.mainCharacter = new Character(mainCharacter);
    }

    public Videogame(Videogame videogame){
        this.gameName = videogame.getGameName();
        this.genre = videogame.getGenre();
        this.mainCharacter = new Character(videogame.getMainCharacter());
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Character getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Character mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
}
