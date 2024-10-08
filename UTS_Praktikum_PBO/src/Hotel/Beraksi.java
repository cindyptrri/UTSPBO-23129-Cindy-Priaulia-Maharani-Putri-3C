/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotel;

/**
 *
 * @author CINDY
 */
import java.util.Scanner;

public class Beraksi {
    public static void main(String[] args) {
        Reservable hotel = new Hotel(); // Menggunakan interface
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Check room availability");
            System.out.println("2. Make a reservation");
            System.out.println("3. View reservations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter room type (Single/Double/Suite): ");
                    String roomType = scanner.next();
                    boolean isAvailable = hotel.checkAvailability(roomType);
                    if (isAvailable) {
                        System.out.println("Room of type " + roomType + " is available.");
                    } else {
                        System.out.println("No available rooms of that type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter room type (Single/Double/Suite): ");
                    String type = scanner.next();
                    System.out.print("Enter number of nights: ");
                    int nights = scanner.nextInt();
                    hotel.makeReservation(customerName, type, nights);
                    break;

                case 3:
                    ((Hotel) hotel).viewReservations(); // Casting ke Hotel untuk akses method viewReservations
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}