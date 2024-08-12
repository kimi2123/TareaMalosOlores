/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispensables;


public class OrderProcessor {

    // Este método procesa el pedido y devuelve una cadena de confirmación
    public String processOrder(Order order) {
        // Verifica si el pedido es válido
        if (order.isValid()) {
            // Calcula el precio total
            double totalPrice = calculate(order);
            // Aplica un descuento si es elegible
            if (order.isEligibleForDiscount()) {
                totalPrice = Discount(totalPrice);
            }
            // Actualiza el estado del pedido
            order.setStatus("Processed");
            // Devuelve el mensaje de confirmación
            return "Pedido procesado. Total: " + totalPrice;
        } else {
            // Devuelve un mensaje de error
            return "Pedido inválido";
        }
    }

    // Este método calcula el precio total del pedido
    private double calculate(Order order) {
        System.out.println("Codigo para calcular precio toal");
        return 2.0;
    }

    // Este método aplica un descuento al precio total
    private double Discount(double price) {
        return price * 0.9;
    }
}
