import java.util.Random;
import java.util.random.RandomGenerator;
public class ParkingPermit {
    Random rand = new Random();
    private int permitId = rand.nextInt(1000, 9999);
    private String carMake, carModel, carYear;

    public ParkingPermit() {
        carMake = "";
        carModel = "";
        carYear = "";
    }

    public ParkingPermit(String make, String model, String year){
        this.carMake = make;
        this.carModel = model;
        this.carYear = year;
    }

    public ParkingPermit(ParkingPermit permit){
        this.carMake = permit.getCarMake();
        this.carModel = permit.getCarModel();
        this.carYear = permit.getCarYear();
    }

    public int getPermitId() {
        return permitId;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }
}
