package Services;

import Entity.Book;
import Repo.userRepo;

public class userService {
    userRepo repo = new userRepo();
    public void addUser(String login, String name, String surname){
        repo.addUser(login, name, surname);
    }

    public void printUsers(){
        repo.printUsers();
    }

    public void printUserInfo(String login){
        repo.printUserInfo(login);
    }

    public void removeUser(String login) {
        repo.removeUser(login);
    }

    public void takeBook(String login, Book book){
        repo.takeBook(login, book);
    }

    public void returnBook(String login, Book book){
        repo.returnBook(login, book);
    }
}
