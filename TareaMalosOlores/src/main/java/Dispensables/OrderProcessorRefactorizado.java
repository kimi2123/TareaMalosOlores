package Dispensables;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class OrderProcessorRefactorizado{

    public String processOrder(Order order) {
        if (!order.isValid()) {
            return "Pedido inválido";
        }

        double totalPrice = calculateTotalPrice(order);

        if (order.isEligibleForDiscount()) {
            totalPrice = applyDiscount(totalPrice);
        }

        order.setStatus("Processed");

        return generarMensajeDeConfirmación(totalPrice);
    }

    private double calculateTotalPrice(Order order) {
        System.out.println("Codigo para calcular precio toal");
        return 2.0;
    }


    private double applyDiscount(double price) {
        return price * 0.9;
    }

    private String generarMensajeDeConfirmación(double totalPrice) {
        return "Pedido procesado. Total: " + totalPrice;
    }
}