//Addison Teschan
//Mar 7 2024
//Defines the videogame class itself

public class VideoGame {
    String title, genre, platform;
    double price;
    public VideoGame(){
        title = "";
        genre = "";
        platform = "";
        price = 0.0;
    }

    public VideoGame(String title, String genre, String platform, double price){
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.price = price;
    }

    public VideoGame(VideoGame game){
        this.title = game.title;
        this.genre = game.genre;
        this.platform = game.platform;
        this.price = game.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        String body = "";
        body += "Title: " + title + " \n";
        body += "Genre: " + genre + " \n";
        body += "Platform: " + platform + " \n";
        body += "Price: " + price + " \n";
        return body;
    }
}
