/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispensables;

/**
 *
 * @author erick
 */

public class Direccion {
    private String street;
    private String city;

    public String getFullAddress() {
        return street + ", " + city;
    }
}