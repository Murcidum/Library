package org.example.Books;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    public void updateBook(int id, Book newBook) {
        booksMap.replace(id, newBook);
    }

    //TODO: вывод всего списка книг
    public void showAllBooks() {
        for(Book book1: booksMap.values()){
            System.out.println(book1.getName());
        }
    }

    //TODO: Вывод конкретной книги
    public void showBook(int id) {
        System.out.println(booksMap.get(id).getName());
    }

    //TODO: Удаление книги или списка книг
    public void deleteBook (int id) {
        booksMap.remove(id);
    }

    //TODO: Удаление всех книг
    void deleteAllBooks() {
        booksMap.clear();
    }
    //TODO: Сохранить весь перечень книг в JSON Serialization
    void saveAllBookToJsonFile() {

//        ObjectMapper objectMapper = new ObjectMapper();
//        //Serialization to Json file
//        //String to Json
//        String json = new ObjectMapper().writeValueAsString(myItem);
//        //Create file
//        objectMapper.writeValue(new File("item.json"), myItem);
//        System.out.println(json);

    }

    //TODO: Загрузить список из JSON
    void getBooksListFromJson() {

    }

}
