import java.util.*;

public class CountryUtils {

    public static void inputCountryData(Country country, Scanner scanner) {
        System.out.print("Введіть назву країни: ");
        String name = scanner.nextLine();

        System.out.print("Введіть назву континенту: ");
        String continent = scanner.nextLine();

        System.out.print("Введіть кількість жителів: ");
        long population = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Введіть телефонний код: ");
        String phoneCode = scanner.nextLine();

        System.out.print("Введіть назву столиці: ");
        String capital = scanner.nextLine();

        System.out.print("Введіть міста країни (через кому): ");
        String citiesInput = scanner.nextLine();
        List<String> cities = Arrays.asList(citiesInput.split(",\\s*"));

        country.inputData(name, continent, population, phoneCode, capital, cities);
        System.out.println("Дані успішно введено.");
    }

    public static void modifyCountryData(Country country, Scanner scanner) {
        while (true) {
            System.out.println("\nЩо ви хочете змінити?");
            System.out.println("1 - Назва країни");
            System.out.println("2 - Назва континенту");
            System.out.println("3 - Кількість жителів");
            System.out.println("4 - Телефонний код");
            System.out.println("5 - Назва столиці");
            System.out.println("6 - Список міст");
            System.out.println("0 - Повернутися до головного меню");
            System.out.print("Введіть номер дії: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введіть нову назву країни: ");
                    country.setCountryName(scanner.nextLine());
                    System.out.println("Назву країни оновлено.");
                    break;
                case 2:
                    System.out.print("Введіть нову назву континенту: ");
                    country.setContinentName(scanner.nextLine());
                    System.out.println("Назву континенту оновлено.");
                    break;
                case 3:
                    System.out.print("Введіть нову кількість жителів: ");
                    country.setPopulation(scanner.nextLong());
                    scanner.nextLine();
                    System.out.println("Кількість жителів оновлено.");
                    break;
                case 4:
                    System.out.print("Введіть новий телефонний код: ");
                    country.setPhoneCode(scanner.nextLine());
                    System.out.println("Телефонний код оновлено.");
                    break;
                case 5:
                    System.out.print("Введіть нову назву столиці: ");
                    country.setCapitalCity(scanner.nextLine());
                    System.out.println("Назву столиці оновлено.");
                    break;
                case 6:
                    System.out.print("Введіть нові міста країни (через кому): ");
                    String citiesInput = scanner.nextLine();
                    country.setCityNames(Arrays.asList(citiesInput.split(",\\s*")));
                    System.out.println("Список міст оновлено.");
                    break;
                case 0:
                    System.out.println("Повернення до головного меню.");
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
