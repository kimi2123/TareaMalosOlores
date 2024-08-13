/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

//Refactorizacion: Replace Inheritance with Delegation.
public class Scanner_Refactorizado {
    private Scannable_Refactorizado scanBehavior = new ScanBehavior_Refactorizado();

    public void performScan() {
        scanBehavior.scan();
    }
}
