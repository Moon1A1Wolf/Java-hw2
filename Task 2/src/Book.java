import java.time.Year;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;

    // Конструктор
    public Book(String title, String author, int year, String publisher, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    // Геттери і сеттери
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    @Override
    public String toString() {
        return "Назва: " + title + ", Автор: " + author + ", Рік: " + year + ", Видавництво: " + publisher + ", Жанр: " + genre + ", Сторінки: " + pages;
    }

    // Перевірка правильності даних
    public static boolean isValidString(String input) {
        return input.matches("[іїа-яА-Яa-zA-Z\\s]+");
    }

    public static boolean isValidNumber(String input) {
        return input.matches("\\d+");
    }

    public static boolean isValidYear(String input) {
        if (!isValidNumber(input)) return false;
        int year = Integer.parseInt(input);
        int currentYear = Year.now().getValue();
        return year >= 1700 && year <= currentYear;
    }
}