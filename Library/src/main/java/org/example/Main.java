package org.example;

import org.example.Books.Book;
import org.example.Books.Lib;

public class Main {
    public static void main(String[] args) {
        //Todo code and tests

        Lib library = new Lib();

        //Test на добавление книг
        library.addBook("Евгений Онегин");
        library.addBook("Война и мир, 1 Том");

        //Test вывода
        library.showAllBooks();
        library.showBook(1);

        //Test редактирование книги
        Book bookTest = new Book();
        bookTest.setName("Бибизян");
        library.updateBook(1, bookTest);
        library.showAllBooks();

        //Test удаления
        library.deleteBook(1);
        library.showAllBooks();

    }
}