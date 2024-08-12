/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispensables;

/**
 *
 * @author erick
 */

public class PersonRefactorizado {
    private String name;
    private int age;

    public PersonRefactorizado(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void celebrateBirthday() {
        age++;
        System.out.println(name + " is now " + age + " years old.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}