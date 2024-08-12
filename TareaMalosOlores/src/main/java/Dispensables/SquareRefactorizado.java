/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispensables;

/**
 *
 * @author erick
 */

public class SquareRefactorizado extends Shape {
    private double side;

    public SquareRefactorizado(double side) {
        this.side = side;
    }

   
    public double calculateArea() {
        return side * side;
    }

 
    public double calculatePerimeter() {
        return 4 * side;
    }
}