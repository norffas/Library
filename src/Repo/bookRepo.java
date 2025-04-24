package Repo;
import Entity.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bookRepo {
    HashMap<String, Book> books = new HashMap<>();

    public void addBook(String author, String name, String genre){
        Book book = new Book(author, name, genre);
        books.put(book.getBookId(), book);
    }

    public Book getBook(String bookId){
        return books.get(bookId);
    }

    public void printBooks(){
        for(Map.Entry entry : books.entrySet()){
            System.out.println(entry);
        }
    }

    public void removeBook(String bookId){
        books.remove(bookId);
    }

    public void printBooks(String genre){
        for(Map.Entry<String, Book> entry : books.entrySet()){
            if(entry.getValue().getGenre().equals(genre))
            System.out.println(entry);
        }
    }
}
