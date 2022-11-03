package transport;

public abstract class  Transport {
    private final String Brand;
    private final String Model;
    private final int yearOfProduction;
    private final String countryOfManufacture;
    private String bodyColor;
    private int maximumMovementSpeed;


    public Transport(String brand, String model, int yearOfProduction, String countryOfManufacture){


        Brand = brand;
        Model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfManufacture = countryOfManufacture;
    }

    public Transport(String brand, String model, int yearOfProduction, String countryOfManufacture, String bodyColor) {
        Brand = brand;
        Model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfManufacture = countryOfManufacture;
        this.bodyColor = bodyColor;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
    public Transport(String brand, String model, int yearOfProduction, String countryOfManufacture, int maximumMovementSpeed) {
        Brand = brand;
        Model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfManufacture = countryOfManufacture;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public String getbrand() {
        return Brand;
    }


    public String getModel() {
        return Model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }


    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }


    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor== null || bodyColor.isEmpty() || bodyColor.isBlank())
            System.out.println("Неверное значение");
        this.bodyColor = bodyColor;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }



    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed == 0 || maximumMovementSpeed <0 )
            System.out.println("Неверное значение");
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
    public void printTpansport(){
        System.out.println("Данные о транспорте" + getClass());
    }

    public abstract void refill();



}
