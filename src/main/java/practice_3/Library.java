package practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String newTitle) {
        bookTitle = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        category = newCategory;
    }
}
