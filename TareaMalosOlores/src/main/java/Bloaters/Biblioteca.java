/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloaters;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Biblioteca {
    ArrayList <String> libros= new ArrayList();
    ArrayList <String> usuarios= new ArrayList();
    
    public void agregarLibro(String libro){
        libros.add(libro);
    }
    
    public void quitarLibro(String libro){
        libros.remove(libro);
    }
    
    public void agregarUsuario(String usuario){
        usuarios.add(usuario);
    }
    
    public void quitarUsuario(String usuario){
        usuarios.remove(usuario);
    }
}
