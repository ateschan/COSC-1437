public class Gamestudio {
    String studioName, location;
    Videogame publishedGame;

    public Gamestudio(){
        studioName = "";
        location = "";
        publishedGame = new Videogame();
    }

    public Gamestudio(String studioName, String location, Videogame publishedGame){
        this.studioName = studioName;
        this.location = location;
        this.publishedGame = new Videogame(publishedGame);
    }

    public Gamestudio(Gamestudio gamestudio){
        this.studioName = gamestudio.getStudioName();
        this.location = gamestudio.getLocation();
        this.publishedGame = new Videogame(gamestudio.getPublishedGame());
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Videogame getPublishedGame() {
        return publishedGame;
    }

    public void setPublishedGame(Videogame publishedGame) {
        this.publishedGame = publishedGame;
    }
}
