//Addison Teschan
//January 29, 2024
//House
//The house class will encapsulate the attributes of a house that can calculate square footage.

public class House{
    private String Address;
    private int NumBedrooms, SquareFeet;
    private double NumBathrooms, Price;

    public House(){
        Address = "";
        NumBedrooms = 0;
        SquareFeet = 0;
        NumBathrooms = 0.0;
        Price = 0.0;

    }
    public House(String address, int numBedrooms, int squareFeet, double numBathrooms, double price){
        this.Address = address;
        this.NumBedrooms = numBedrooms;
        this.SquareFeet = squareFeet;
        this.NumBathrooms = numBathrooms;
        this.Price = price;
    }
    //My getters
    public String getAddress() {
        return Address;
    }
    public int getNumBedrooms() {
        return NumBedrooms;
    }
    public int getSquareFeet() {
        return SquareFeet;
    }
    public double getNumBathrooms() {
        return NumBathrooms;
    }
    public double getPrice() {
        return Price;
    }

    //My Setters
    public void setAddress(String address) {
        Address = address;
    }
    public void setNumBedrooms(int numBedrooms) {
        NumBedrooms = numBedrooms;
    }
    public void setSquareFeet(int squareFeet) {
        SquareFeet = squareFeet;
    }
    public void setNumBathrooms(double numBathrooms) {
        NumBathrooms = numBathrooms;
    }
    public void setPrice(double price) {
        Price = price;
    }

    //Calculate overall price
    public double calculatePricePerSqFt(){
        return getPrice() / getSquareFeet();
    }
}
