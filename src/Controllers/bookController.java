package Controllers;

import Entity.Book;
import Services.bookService;

public class bookController {
    bookService bookService = new bookService();

    public void addBook(String author, String name, String genre){
        bookService.addBook(author, name, genre);
    }

    public Book getBook(String bookId){
        return bookService.getBook(bookId);
    }

    public void printBooks(){
        bookService.printBooks();
    }

    public void removeBook(String bookId){
        bookService.removeBook(bookId);
    }
    public void printBooks(String genre){
        bookService.printBooks(genre);
    }
}
