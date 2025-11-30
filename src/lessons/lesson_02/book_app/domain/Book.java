package lessons.lesson_02.book_app.domain;

public class Book {
    private int id;
    private String author;
    private String title;
    private int year;

    public Book(int id, String author, String title, int year) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
