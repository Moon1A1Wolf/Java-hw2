import java.time.Year;

public class Car {
    private String modelName;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car() {
        this.modelName = "Unknown";
        this.manufacturer = "Unknown";
        this.year = Year.now().getValue();
        this.engineVolume = 0.0;
    }

    public Car(String modelName, String manufacturer, int year, double engineVolume) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (Validator.isValidString(modelName)) {
            this.modelName = modelName;
        } else {
            throw new IllegalArgumentException("Некоректна назва моделі!");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (Validator.isValidString(manufacturer)) {
            this.manufacturer = manufacturer;
        } else {
            throw new IllegalArgumentException("Некоректна назва виробника!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (Validator.isValidYear(year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Некоректний рік випуску!");
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Validator.isValidEngineVolume(engineVolume)) {
            this.engineVolume = engineVolume;
        } else {
            throw new IllegalArgumentException("Некоректний об'єм двигуна!");
        }
    }

    public void display() {
        System.out.println("Модель: " + modelName);
        System.out.println("Виробник: " + manufacturer);
        System.out.println("Рік випуску: " + year);
        System.out.println("Об'єм двигуна: " + engineVolume + " л");
    }
}
