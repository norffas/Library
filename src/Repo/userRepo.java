package Repo;
import Entity.*;

import java.util.*;

public class userRepo {
    HashMap<String, User> users = new HashMap<>();

    public void addUser(String login, String name, String surname){
        User user = new User(login, name, surname);
        users.put(login, user);
    }

    public void printUsers(){
        for(Map.Entry entry : users.entrySet()){
            System.out.print("Пользователь ");
            System.out.println(entry);
        }
    }

    public void printUserInfo(String login){
        System.out.println(users.get(login));
    }

    public void removeUser(String login){
        users.remove(login);
    }

    public void takeBook(String login, Book book){
        users.get(login).setBook(book);
    }

    public void returnBook(String login, Book book){
        users.get(login).deleteBook(book);
    }
}
