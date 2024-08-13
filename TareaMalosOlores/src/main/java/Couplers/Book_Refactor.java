/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couplers;

//Refactorizacion: Hide Delegate
public class Book_Refactor {
    private String title;
    private String author;
    private String isbn;

    public Book_Refactor(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }

}
