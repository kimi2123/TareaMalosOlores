/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;
//Refactorizacion: Hide Delegate

import java.util.List;

public class Library_Refactor {
    private List<Book_Refactor> books;

    public Library_Refactor(List<Book_Refactor> books) {
        this.books = books;
    }

    public void printBookDetails() {
        for (Book_Refactor book : books) {
            // Usa el método encapsulado para obtener los detalles del libro
            System.out.println(book.getBookDetails());
            System.out.println();
        }
    }

}
