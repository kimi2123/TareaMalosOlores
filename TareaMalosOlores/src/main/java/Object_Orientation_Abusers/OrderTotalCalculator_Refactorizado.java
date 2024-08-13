/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

// Refactorizacion: Extract Class

import java.util.List;

public class OrderTotalCalculator_Refactorizado {
    private List<Item> items;

    public OrderTotalCalculator_Refactorizado(List<Item> items) {
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0; // Variable local para el cálculo
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
