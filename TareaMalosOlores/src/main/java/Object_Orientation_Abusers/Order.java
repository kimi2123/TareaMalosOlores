/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

//Mal olor: Temporary Field

import java.util.List;

public class Order {
    private List<Item> items;
    private double totalPrice; // Campo temporal

    public Order(List<Item> items) {
        this.items = items;
    }

    public double calculateTotal() {
        totalPrice = 0; // Resetea el campo temporal
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
