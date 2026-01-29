import Controllers.bookController;
import Controllers.userController;

public class Main {
    public static void main(String[] args) {
        userController userController = new userController();
        bookController bookController = new bookController();
        userController.addUser("audiopunk", "sergey", "ivanov");
        userController.addUser("check", "viktor", "jukov");
        userController.addUser("test", "viktor", "jukov");
        bookController.addBook("Sidorenko", "V parke", "Adventure");
        bookController.addBook("Pelevin", "V govne", "Base");
        bookController.addBook("Kizaru", "Dejavu", "Base");
        bookController.printBooks("Base");
        userController.takeBook("test", bookController.getBook("2"));
        userController.takeBook("test", bookController.getBook("1"));
        userController.printUserInfo("test");
        userController.returnBook("test", bookController.getBook("2"));
        userController.printUserInfo("test");

    }
}
