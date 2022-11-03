package transport;

public class  Bus extends Transport {
    public Bus() {
        super(brand, model, yearOfProduction, countryOfManufacture);
    }

    public Bus(String brand, String model, int yearOfProduction) {
        super(brand, model, yearOfProduction, countryOfManufacture);
    }

    public Bus(String brand, String model, int yearOfProduction, String countryOfManufacture, String bodyColor) {
        super(brand, model, yearOfProduction, countryOfManufacture, bodyColor);
    }

    public Bus(String brand, String model, int yearOfProduction, String countryOfManufacture, int maximumMovementSpeed) {
        super(brand, model, yearOfProduction, countryOfManufacture, maximumMovementSpeed);
    }
    public void printBusInfo() {
        System.out.println(" Модель " + getModel() + " марка " + getbrand() + " год выпуска " + getYearOfProduction()  );
    }
    public void refill(){
        System.out.println(" можно заправлять бензином или дизелем на заправке");

    }
}
