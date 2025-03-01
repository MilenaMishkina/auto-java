package practice_2;

public class Book {
    String title;
    String author;

    public Book(String titleValue, String authorValue) {
        title = titleValue;
        author = authorValue;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void printInfo() {
        System.out.println("Название: " + title + ", " + "Автор: " + author);
    }

    public static void main(String[] args) {
        Book newBook = new Book("Гарри Поттер", "Джоан Роулинг");
        newBook.printInfo();
        newBook.setAuthor("Чарльз Диккенс");
        newBook.printInfo();
    }
}
