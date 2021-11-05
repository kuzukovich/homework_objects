package sky.pro;

public class Book {
    private int yearPublication;
    private String bookName;
    private final Author author;

    public Book(int yearPublication, String bookName, Author author) {
        this.yearPublication = yearPublication;
        this.bookName = bookName;
        this.author = author;
    }

    public int getYearPublication() {

        return this.yearPublication;
    }

    public String getBookName() {

        return this.bookName;
    }

    public String getSurName() {
        return author.getSurName();

    }

    public String getFirstName() {
        return author.getFirstName();

    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

}
