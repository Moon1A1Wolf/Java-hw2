import java.util.*;

class Country {
    private String countryName;
    private String continentName;
    private long population;
    private String phoneCode;
    private String capitalCity;
    private List<String> cityNames;

    public Country() {
        this.cityNames = new ArrayList<>();
    }

    public void inputData(String countryName, String continentName, long population, String phoneCode, String capitalCity, List<String> cityNames) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capitalCity = capitalCity;
        this.cityNames = cityNames;
    }

    public void displayData() {
        System.out.println("\nДані про країну:");
        System.out.println("Назва країни: " + (countryName != null ? countryName : "Не задано"));
        System.out.println("Континент: " + (continentName != null ? continentName : "Не задано"));
        System.out.println("Населення: " + (population > 0 ? population : "Не задано"));
        System.out.println("Телефонний код: " + (phoneCode != null ? phoneCode : "Не задано"));
        System.out.println("Столиця: " + (capitalCity != null ? capitalCity : "Не задано"));
        System.out.println("Міста: " + (cityNames.isEmpty() ? "Не задано" : String.join(", ", cityNames)));
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setCityNames(List<String> cityNames) {
        this.cityNames = cityNames;
    }
}