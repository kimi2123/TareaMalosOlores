/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

//Refactorizacion: Move method

public class Invoice_Refactorizado {
    private Customer_Refactorizado  customer;
    private double totalAmount;

    public Invoice_Refactorizado (Customer_Refactorizado  customer, double totalAmount) {
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public double calculateTotalWithDiscount() {
        double discount = customer.calculateDiscount(totalAmount);
        return totalAmount - discount;
    }

}
