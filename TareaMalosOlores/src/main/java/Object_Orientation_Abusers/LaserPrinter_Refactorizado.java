/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

//Refactorizacion: Replace Inheritance with Delegation.


public class LaserPrinter_Refactorizado {
    private Printable_Refactorizado printBehavior = new PrintBehavior_Refactorizado();

    public void performPrint() {
        printBehavior.print();
    }
}
