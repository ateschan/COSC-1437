public class Benefits {
    private String type;
    private float cost;
    private String provider;

    public Benefits(){
        type = "";
        cost = 0;
        provider = "None";
    }

    public Benefits(String type, float cost, String provider){
        this.type = type;
        this.cost = cost;
        this.provider = provider;
    }

    public Benefits(Benefits benefit){
        this.type = benefit.type;
        this.cost = benefit.cost;
        this.provider = benefit.provider;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void PrintBenefitInfo(){
        System.out.println("Type: " + this.type + "\nCost: " + this.cost + "\nProvider: " + this.provider);
    }
}
