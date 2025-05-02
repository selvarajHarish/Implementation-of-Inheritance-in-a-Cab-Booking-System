package inheritance;

public class OLA {
    public static void bookingDetails(Cab cab) {
        System.out.println("**** Booking Details *****");
        System.out.println("=========================");
        System.out.println("Pickup Location: " + cab.pickupLocation);
        System.out.println("Drop Location: " + cab.dropLocation);
        System.out.println("Driver: " + cab.driver);
        System.out.println("Car Brand: " + cab.brand);
        System.out.println("Car Model: " + cab.model);
        System.out.println("No of Seats: " + cab.noSeats);
        System.out.println("Car No: " + cab.carNo);
        System.out.println("Phone Number: " + cab.phoneNo);
        System.out.println("Ratings: " + cab.ratings);

        if (cab instanceof Mini) {
            System.out.println("Price: Rs." + ((Mini) cab).pricePerKm + "/km");
        } else if (cab instanceof Sedan) {
            System.out.println("Price: Rs." + ((Sedan) cab).pricePerKm + "/km");
        } else if (cab instanceof Luxury) {
            System.out.println("Price: Rs." + ((Luxury) cab).pricePerKm + "/km");
        }

        System.out.println("=========================");
    }
}
