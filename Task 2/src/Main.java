import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager manager = new BookManager();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати книгу");
            System.out.println("2. Переглянути список книг");
            System.out.println("0. Вийти");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    manager.addBook(scanner);
                    break;
                case "2":
                    manager.displayBooks();
                    break;
                case "0":
                    System.out.println("Програма завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }
}
