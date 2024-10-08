/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author CINDY
 */
import java.util.ArrayList;

public class Hotel implements Reservable {
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
        // Tambah kamar default
        rooms.add(new Room(101, "Single", true));
        rooms.add(new Room(102, "Double", true));
        rooms.add(new Room(103, "Suite", true));
    }

    @Override
    public boolean checkAvailability(String roomType) {
        for (Room room : rooms) {
            if (room.getRoomType().equals(roomType) && room.isAvailable()) {
                return true; // Kamar tersedia
            }
        }
        return false; // Kamar tidak tersedia
    }

    @Override
    public void makeReservation(String customerName, String roomType, int nights) {
        Room availableRoom = null;
        for (Room room : rooms) {
            if (room.getRoomType().equals(roomType) && room.isAvailable()) {
                availableRoom = room;
                break; // Kamar tersedia ditemukan
            }
        }
        
        if (availableRoom != null) {
            Reservation reservation = new Reservation(customerName, availableRoom, nights);
            reservations.add(reservation);
            System.out.println("Reservation successful: " + reservation);
        } else {
            System.out.println("No available rooms of type " + roomType);
        }
    }

    public void viewReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}