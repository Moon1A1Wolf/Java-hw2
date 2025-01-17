import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Ввести дані про автомобіль");
            System.out.println("2. Вивести дані про автомобіль");
            System.out.println("3. Вийти");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("Введіть назву моделі: ");
                        car.setModelName(scanner.nextLine());

                        System.out.print("Введіть назву виробника: ");
                        car.setManufacturer(scanner.nextLine());

                        System.out.print("Введіть рік випуску: ");
                        int year = Integer.parseInt(scanner.nextLine());
                        car.setYear(year);

                        System.out.print("Введіть об'єм двигуна (л): ");
                        double engineVolume = Double.parseDouble(scanner.nextLine());
                        car.setEngineVolume(engineVolume);

                        System.out.println("Дані успішно збережені!");
                    } catch (Exception e) {
                        System.out.println("Помилка: " + e.getMessage());
                    }
                    break;

                case "2":
                    car.display();
                    break;

                case "3":
                    System.out.println("Вихід з програми.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Некоректний вибір. Спробуйте ще раз.");
            }
        }
    }
}
