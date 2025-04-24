package Services;

import Entity.Book;
import Repo.bookRepo;

public class bookService {
    bookRepo bookRepo = new bookRepo();

    public void addBook(String author, String name, String genre){
        bookRepo.addBook(author, name, genre);
    }

    public Book getBook(String bookId){
        return bookRepo.getBook(bookId);
    }

    public void printBooks(){
        bookRepo.printBooks();
    }

    public void removeBook(String bookId){
        bookRepo.removeBook(bookId);
    }

    public void printBooks(String genre){
        bookRepo.printBooks(genre);
    }
}
