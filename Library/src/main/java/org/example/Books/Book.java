package org.example.Books;

//DTO BOOK
public class Book {
    String name;
    Author author;
    int publicationYear = 0;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
