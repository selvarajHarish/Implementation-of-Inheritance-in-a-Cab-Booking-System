package inheritance;

import java.util.Scanner;

public class CabDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****** Welcome to OLA ******");
        System.out.println("1. Mini \n2. Sedan \n3. Luxury");
        
        Cab cab = null;
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Pickup location:");
        String pickup = sc.nextLine();
        System.out.println("Drop location:");
        String drop = sc.nextLine();

        switch (choice) {
            case 1 -> {
                cab = new Mini(pickup, drop, "Harish", "Swift", "Suzuki", 4, "AP039456", 656667888, 3.4, 10);
                OLA.bookingDetails(cab);
            }
            case 2 -> {
                cab = new Sedan(pickup, drop, "Naveen", "Innova", "Toyota", 4, "AP039457", 96789990, 2.4, 20);
                OLA.bookingDetails(cab);
            }
            case 3 -> {
                cab = new Luxury(pickup, drop, "Rahul", "RR", "Latest", 4, "AP039486", 967895432, 4.4, 50);
                OLA.bookingDetails(cab);
            }
            default -> System.out.println("Invalid choice. Please select a valid cab type.");
        }

        sc.close();
    }
}
