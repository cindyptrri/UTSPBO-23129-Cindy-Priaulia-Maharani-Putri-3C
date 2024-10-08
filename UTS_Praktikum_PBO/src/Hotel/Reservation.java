/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author CINDY
 */
public class Reservation {
    private String customerName;
    private Room room;
    private int nights;

    public Reservation(String customerName, Room room, int nights) {
        this.customerName = customerName;
        this.room = room;
        this.nights = nights;
        room.setAvailability(false);  // Set kamar sebagai tidak tersedia setelah dipesan
    }

    public String getCustomerName() {
        return customerName;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    public String toString() {
        return "Reservation for " + customerName + ": Room " + room.getRoomNumber() +
               " for " + nights + " nights";
    }
}