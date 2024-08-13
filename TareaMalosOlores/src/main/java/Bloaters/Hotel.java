/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloaters;

/**
 *
 * @author ariel
 */
import java.time.LocalDate;
public class Hotel {
    public String crearReserva(String nombre, String telefono, String email, 
            LocalDate fecha_entrada, LocalDate fecha_salida, String tipo_habitacion, 
            int numero_habitacion, double precio, double descuento, double total){
        String reserva="nombre_cliente: "+nombre+ "telefono: "+telefono+"email: "+email+
        "fecha_entrada: "+fecha_entrada+" fecha_salida"+fecha_salida+" tipo_habitacion: "+tipo_habitacion+
        " numero_habitacion: "+numero_habitacion+" precio: "+precio+"descuento: "+descuento+
        " total_a_pagar: "+total;
       return reserva;
    }
}
