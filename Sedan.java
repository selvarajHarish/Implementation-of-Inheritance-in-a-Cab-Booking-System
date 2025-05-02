package inheritance;

public class Sedan extends Cab {
    double pricePerKm;

    public Sedan(String pickupLocation, String dropLocation, String driver, String brand, String model, int noSeats, String carNo, long phoneNo, double ratings, double pricePerKm) {
        super(pickupLocation, dropLocation, driver, brand, model, noSeats, carNo, phoneNo, ratings);
        this.pricePerKm = pricePerKm;
    }
}
