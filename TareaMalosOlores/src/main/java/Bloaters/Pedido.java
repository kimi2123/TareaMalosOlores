/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloaters;

/**
 *
 * @author ariel
 */
public class Pedido {
   private float subtotal;
   private float total;
   private float descuento;
   private int cantidad;
   private float precio;
   private float costoEnvio;
   
   public float procesarPedido(){
       subtotal=cantidad*precio;
       if (subtotal>50){
           costoEnvio=(float) 10.5;
           total=subtotal+costoEnvio;
       }
       if (subtotal>100){
           costoEnvio= (float)5.75;
           descuento=(float) (subtotal*0.1);
           total=subtotal+costoEnvio-descuento;
       }   
       System.out.println("El subtotal es"+subtotal);
       System.out.println("El descuento es"+descuento);
       System.out.println("El total es"+total);
    return total;
    }
   
   
}
    