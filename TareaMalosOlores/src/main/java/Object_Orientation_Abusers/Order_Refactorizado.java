/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

import java.util.List;

/**
 *
 * @author jorge
 */
public class Order_Refactorizado {
    private List<Item> items;
    private OrderTotalCalculator_Refactorizado totalCalculator;

    public Order_Refactorizado(List<Item> items) {
        this.items = items;
        this.totalCalculator = new OrderTotalCalculator_Refactorizado(items);
    }

    public double calculateTotal() {
        return totalCalculator.calculateTotal();
    }

}
