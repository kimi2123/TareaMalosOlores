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
public class BibliotecaRefactor {
    
}

class Libros{
    ArrayList <String> libros= new ArrayList();
    
    public void agregarLibro(String libro){
        libros.add(libro);
    }
    
    public void quitarLibro(String libro){
        libros.remove(libro);
    }
}

class Usuarios{
    ArrayList <String> usuarios= new ArrayList();
    public void agregarUsuario(String usuario){
        usuarios.add(usuario);
    }
    
    public void quitarUsuario(String usuario){
        usuarios.remove(usuario);
    }
}
