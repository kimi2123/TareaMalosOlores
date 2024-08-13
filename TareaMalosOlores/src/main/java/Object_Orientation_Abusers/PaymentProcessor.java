/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

//mal olor: Switch Statements
public class PaymentProcessor {
    public void processPayment(String paymentType) {
        switch (paymentType) {
            case "CreditCard":
                // Código para procesar tarjeta de crédito
                break;
            case "PayPal":
                // Código para procesar PayPal
                break;
            default:
                throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
    }
}
