package Entity;

public class Book {
    String bookId;
    String name;
    String author;
    String genre;
    private static int countBookId = 1;

    public Book(String author, String name, String genre) {
        this.bookId = Integer.toString(getCountBookId());
        this.author = author;
        this.name = name;
        this.genre = genre;
        countBookId++;

    }

    public int getCountBookId() {
        return countBookId;
    }


    public String getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookId='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", countBookId=" + countBookId +
                '}';
    }

    public String getGenre() {
        return genre;
    }
}
