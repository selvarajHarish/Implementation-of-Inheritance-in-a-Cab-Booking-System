package inheritance;

public class Cab {
    String pickupLocation;
    String dropLocation;
    String driver;
    String brand;
    String model;
    int noSeats;
    String carNo;
    long phoneNo;
    double ratings;

    public Cab(String pickupLocation, String dropLocation, String driver, String brand, String model, int noSeats, String carNo, long phoneNo, double ratings) {
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.driver = driver;
        this.brand = brand;
        this.model = model;
        this.noSeats = noSeats;
        this.carNo = carNo;
        this.phoneNo = phoneNo;
        this.ratings = ratings;
    }
}
