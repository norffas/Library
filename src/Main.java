import Controllers.bookController;
import Controllers.userController;

public class Main {
    public static void main(String[] args) {
        userController userController = new userController();
        bookController bookController = new bookController();
        userController.addUser("audiopunk", "sergey", "ivanov");
        userController.addUser("tvar", "viktor", "jukov");
        userController.addUser("urod", "viktor", "jukov");
        bookController.addBook("Sidorenko", "V parke", "Adventure");
        bookController.addBook("Pelevin", "V govne", "Base");
        bookController.addBook("Kizaru", "Dejavu", "Base");
        bookController.printBooks("Base");
        userController.takeBook("tvar", bookController.getBook("2"));
        userController.takeBook("tvar", bookController.getBook("1"));
        userController.printUserInfo("tvar");
        userController.returnBook("tvar", bookController.getBook("2"));
        userController.printUserInfo("tvar");

    }
}
