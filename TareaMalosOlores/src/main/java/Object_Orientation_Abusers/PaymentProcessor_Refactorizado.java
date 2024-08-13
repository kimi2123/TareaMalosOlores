/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor_Refactorizado {
    private Map<String, PaymentStrategy_Refactorizado> paymentStrategies = new HashMap<>();

    public PaymentProcessor_Refactorizado() {
        paymentStrategies.put("CreditCard", new CreditCardPayment_Refactorizado());
        paymentStrategies.put("PayPal", (PaymentStrategy_Refactorizado) new PayPalPayment_Refactorizado());

    }

    public void processPayment(String paymentType) {
        PaymentStrategy_Refactorizado strategy = paymentStrategies.get(paymentType);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }
        strategy.processPayment();
    }
}

