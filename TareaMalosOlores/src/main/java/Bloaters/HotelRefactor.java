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
public class HotelRefactor {
    Cliente cliente;
    Habitacion hab;
    LocalDate fecha_entrada;
    LocalDate fecha_salida;
    double descuento;

    public HotelRefactor(Cliente cliente, Habitacion hab, LocalDate fecha_entrada, LocalDate fecha_salida,
    double descuento) {
        this.cliente = cliente;
        this.hab = hab;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.descuento = descuento;
    }
    
    class Cliente{
        String nombre;
        String telefono;
        String email;

        public Cliente(String nombre, String telefono, String email) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.email = email;
        }
    }
    
    class  Habitacion{
       String tipo;
       int numero;
       double precio;

        public Habitacion(String tipo, int numero, double precio) {
            this.tipo = tipo;
            this.numero = numero;
            this.precio = precio;
        }
       
    }   
    
}
