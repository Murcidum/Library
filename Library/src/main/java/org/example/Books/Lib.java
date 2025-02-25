package org.example.Books;

import java.util.HashMap;
import java.util.Map;

public class Lib {

    Map<Integer, Book> booksMap = new HashMap<>();
    private int id = 1;

    //TODO: тут можно добавить либо одну книгу, либо целый массив книг
    public void addBook (String name) {
        Book book = new Book();
        book.setName(name);
        booksMap.put(id, book);
        id = id + 1;
    }

    //TODO: Редактирование книги из списка
    void updateBook() {

    }

    //TODO: вывод всего списка книг
    public void showAllBooks() {
        for(Book book1: booksMap.values()){
            System.out.println(book1.getName());
        }
    }

    //TODO: Удаление книги или списка книг
    public void deleteBook (int id) {
        booksMap.remove(id);
    }

    //TODO: Удаление всех книг
    void deleteAllBooks() {

    }
    //TODO: Сохранить весь перечень книг
    void saveAllBookToJsonObj() {

    }

    //TODO: Ниже фильтры по разным категориям
    void filterBooksByAuthor() {

    }

    void filterBooksByYear() {

    }


    void filterBooksByName() {

    }
}
