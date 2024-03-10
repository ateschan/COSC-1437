//Addison Teschan
//January 12, 2024,
//Sport
//The sport class will encapsulate the attributes of a sports team.
public class Sport{
    private String Name;
    private int
            NumberOfPlayers,
            SeasonWins,
            SeasonLosses;
    public Sport(){
        Name = "defaultName";
        SeasonWins  = 0;
        SeasonLosses = 0;
        NumberOfPlayers = 0;
    }
    public Sport(String name, int numOfPlayers, int numOfWins, int numOfLoss){
       this.Name = name;
       this.SeasonWins = numOfWins;
       this.SeasonLosses = numOfLoss;
       this.NumberOfPlayers = numOfPlayers;
    }

    public String getName() {
        return Name;
    }

    public int getNumberOfPlayers() {
        return NumberOfPlayers;
    }

    public int getSeasonWins() {
        return SeasonWins;
    }

    public int getSeasonLosses() {
        return SeasonLosses;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumberOfPlayers(int num){
        NumberOfPlayers = num;
    }

    public void setSeasonLosses(int seasonLosses) {
        SeasonLosses = seasonLosses;
    }

    public void setSeasonWins(int seasonWins) {
        SeasonWins = seasonWins;
    }

    public double winLoss(){
        return (double) SeasonWins / (SeasonWins + SeasonLosses) * 100;
    }
}
