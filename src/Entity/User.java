package Entity;

import java.util.HashSet;

public class User {
    String login;
    String name;
    String surname;
    private HashSet<Book> book = new HashSet<>();

    public User(String login, String name, String surname) {
        this.login = login;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return  "Имя: " + name +
                ", Фамилия: " + surname + "Взятые книги: " + book;
    }

    public void setBook(Book book) {
        this.book.add(book);
    }


    public void deleteBook(Book book){
        this.book.remove(book);
    }
}
