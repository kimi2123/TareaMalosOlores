/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispensables;

/**
 *
 * @author erick
 */
public class User {
    private String username;
    private String email;
    private String password;
    private boolean active;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.active = true;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Este método nunca se usa en la aplicación
    public void deactivateAccount() {
        this.active = false;
        sendDeactivationEmail();
    }

    // Este método nunca se llama
    private void sendDeactivationEmail() {
        System.out.println("Enviando correo de desactivación a " + email);
    }
}