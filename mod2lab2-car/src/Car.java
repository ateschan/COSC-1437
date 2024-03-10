//Addison Teschan
//Car Class
//The Car class will emulate the properties of a car with a drive method
//

public class Car{
    private String Brand, Model;
    private int Year;
    private double Mileage;
    public Car(){
        Brand = "";
        Model = "";
        Year = 0;
        Mileage = 0;
    }
    //Dead code.
    public Car(String brand, String model, int year, double mil){
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.Mileage = mil;
    }
    //These are my getters
    public String getBrand() {
        return Brand;
    }
    public double getMileage() {
        return Mileage;
    }
    public int getYear() {
        return Year;
    }
    public String getModel() {
        return Model;
    }

    //These are my setters
    public void setBrand(String brand) {
        Brand = brand;
    }
    public void setMileage(double mileage) {
        Mileage = mileage;
    }
    public void setYear(int year) {
        Year = year;
    }
    public void setModel(String model) {
        Model = model;
    }
    public void drive(double miles){
        Mileage = getMileage() + miles;
    }
}

