//Addison Teschan
//Mar 7 2024
//Driver class for car lot
import java.util.ArrayList;

public class Main {
    public static void displayInventory(ArrayList<Car> arr){
        for(Car car: arr){
            System.out.println(car);
        }
    }
    public static void calculateTotalValue(ArrayList<Car> arr){
        double total = 0.0;
        for(Car car: arr){
            total += car.getPrice();
        }
        System.out.println("Total value: $" + String.format("%.2f", total));
    }
    public static void main(String[] args) {
      ArrayList<Car> arr = new ArrayList<Car>();

      arr.add(new Car("Honda", "Accor", 204, 7000));
      arr.add(new Car("Hoda", "Acrd", 4, 8000));
      arr.add(new Car("Hda", "Acor", 2005, 700));
      arr.add(new Car("Hona", "Ard", 2006, 2000));
      arr.add(new Car("Hnda", "ord", 2007, 9000));

      displayInventory(arr);
      calculateTotalValue(arr);

    }
}