import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1 - Ввести дані");
            System.out.println("2 - Показати дані");
            System.out.println("3 - Змінити дані");
            System.out.println("0 - Вийти");
            System.out.print("Введіть номер дії: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    CountryUtils.inputCountryData(country, scanner);
                    break;
                case 2:
                    country.displayData();
                    break;
                case 3:
                    CountryUtils.modifyCountryData(country, scanner);
                    break;
                case 0:
                    System.out.println("Вихід з програми.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}