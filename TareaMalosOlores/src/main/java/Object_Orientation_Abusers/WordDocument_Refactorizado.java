/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Orientation_Abusers;

//Refactorizacion: Extract interface
public class WordDocument_Refactorizado implements Document_Refactorizado{
    private String ubicacionWord;
    
    @Override
    public void open(String filePath) {
        // Código para abrir un documento de Word
    }

    @Override
    public void save(String filePath) {
        // Código para guardar un documento de Word
    }
}
