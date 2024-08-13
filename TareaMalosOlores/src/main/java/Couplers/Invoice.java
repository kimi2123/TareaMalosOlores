/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

//mal olor: Feature Envy

public class Invoice {
    private Customer customer;
    private double totalAmount;

    public Invoice(Customer customer, double totalAmount) {
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public double calculateTotalWithDiscount() {
        double discount = 0;
        if (customer.getMembershipStatus().equals("VIP")) {
            discount = totalAmount * 0.2; // 20% descuento para VIP
        } else if (customer.getMembershipStatus().equals("Regular")) {
            discount = totalAmount * 0.1; // 10% descuento para Regular
        }
        return totalAmount - discount;
    }

}
