package Controllers;

import Entity.Book;
import Services.userService;

public class userController {
    userService service = new userService();


    public void addUser(String login, String name, String surname){
        service.addUser(login, name, surname);
    }

    public void printUsers(){
        service.printUsers();
    }

    public void printUserInfo(String login){
        service.printUserInfo(login);
    }

    public void removeUser(String login){
        service.removeUser(login);
    }

    public void takeBook(String login, Book book){
        service.takeBook(login, book);
    }

    public void returnBook(String login, Book book){
        service.returnBook(login, book);
    }
}
