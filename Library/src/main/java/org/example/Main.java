package org.example;

import org.example.Books.Lib;

public class Main {
    public static void main(String[] args) {
        //Todo code and tests

        Lib library = new Lib();

        //Test на добавление книг
        library.addBook("Евгений Онегин");
        library.addBook("Война и мир, 1 Том");

        //Test
        library.showAllBooks();

        //Test
        library.deleteBook(1);

        //Test
        library.showAllBooks();
    }
}