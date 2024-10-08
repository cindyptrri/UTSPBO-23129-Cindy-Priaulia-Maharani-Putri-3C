/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hotel;

/**
 *
 * @author CINDY
 */
public interface Reservable {
     boolean checkAvailability(String roomType);
    void makeReservation(String customerName, String roomType, int nights);
}
