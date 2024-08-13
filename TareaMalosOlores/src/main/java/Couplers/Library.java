/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

import java.util.List;

//mal olor: Inappropriate Intimacy
public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void printBookDetails() {
        for (Book book : books) {
            // Accede directamente a los detalles internos de Book
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }
    }

}
