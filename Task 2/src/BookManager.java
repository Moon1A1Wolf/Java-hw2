import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();

    // Додати книгу
    public void addBook(Scanner scanner) {
        System.out.print("Введіть назву книги: ");
        String title = scanner.nextLine();
        while (!Book.isValidString(title)) {
            System.out.print("Помилка! Введіть назву книги (лише букви): ");
            title = scanner.nextLine();
        }

        System.out.print("Введіть автора книги: ");
        String author = scanner.nextLine();
        while (!Book.isValidString(author)) {
            System.out.print("Помилка! Введіть автора книги (лише букви): ");
            author = scanner.nextLine();
        }

        System.out.print("Введіть рік випуску: ");
        String yearInput = scanner.nextLine();
        while (!Book.isValidYear(yearInput)) {
            System.out.print("Помилка! Введіть рік випуску (лише цифри): ");
            yearInput = scanner.nextLine();
        }
        int year = Integer.parseInt(yearInput);

        System.out.print("Введіть назву видавництва: ");
        String publisher = scanner.nextLine();

        System.out.print("Введіть жанр книги: ");
        String genre = scanner.nextLine();

        System.out.print("Введіть кількість сторінок: ");
        String pagesInput = scanner.nextLine();
        while (!Book.isValidNumber(pagesInput)) {
            System.out.print("Помилка! Введіть кількість сторінок (лише цифри): ");
            pagesInput = scanner.nextLine();
        }
        int pages = Integer.parseInt(pagesInput);

        books.add(new Book(title, author, year, publisher, genre, pages));
        System.out.println("Книга успішно додана!\n");
    }

    // Відобразити всі книги
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Список книг порожній.");
        } else {
            System.out.println("Список книг:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
