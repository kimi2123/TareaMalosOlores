/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloaters;

/**
 *
 * @author ariel
 */
public class Reserva {
    private String fecha_vuelo;
    private int numero_vuelo;
    private int asientos;

    public Reserva(String fecha_vuelo, int numero_vuelo, int asientos) {
        this.fecha_vuelo = fecha_vuelo;
        this.numero_vuelo = numero_vuelo;
        this.asientos = asientos;
    }
    
    public void mostrarReserva(){
        System.out.println("Vuelo: "+this.numero_vuelo+"Fecha: "+this.fecha_vuelo+"Asientos disponibles: "
                +this.asientos);
    }
}
