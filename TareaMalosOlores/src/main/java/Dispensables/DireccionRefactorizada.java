/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispensables;

/**
 *
 * @author erick
 */

public class DireccionRefactorizada {
    private String name;
    private String street;
    private String city;

    public DireccionRefactorizada(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city;
    }
}