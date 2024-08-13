/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

//Refactorizacion: Move method

public class Customer_Refactorizado {
    private String membershipStatus;

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public double calculateDiscount(double totalAmount) {
        double discount = 0;
        if (membershipStatus.equals("VIP")) {
            discount = totalAmount * 0.2; // 20% descuento para VIP
        } else if (membershipStatus.equals("Regular")) {
            discount = totalAmount * 0.1; // 10% descuento para Regular
        }
        return discount;
    }

    }
