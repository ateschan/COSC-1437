//Addison Teschan
//Mar 6 2024
//Car class
//make, mode, year, price;

public class Car {
    String make, model;
    int year;
    double price;

    public Car(){
        this.make = "";
        this.model = "";
        this.year = -1;
        this.price = 0.0;
    }

    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(Car car){
        this.make = car.make;
        this.model = car.model;
        this.year = car.year;
        this.price = car.price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        body += "Make: " + this.make + " ";
        body += "Model: " + this.model + " ";
        body += "Year: " + this.year + " ";
        body += "Price: $" + this.price + " ";

        return body;
    }
}
