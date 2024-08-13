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
public class ReservaRefactor {
  
    public class Fecha_Vuelo{
        private LocalDate fecha;

        public Fecha_Vuelo(LocalDate fecha) {
            this.fecha = LocalDate.now();
        }  
    }
}
