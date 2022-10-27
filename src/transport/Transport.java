package transport;

public abstract class  Transport {
    private String Brand;
    private String Model;
    private int yearOfProduction;
    private String countryOfManufacture;
    private String bodyColor;
    private int maximumMovementSpeed;


    public Transport(){


     }

    public Transport(String brand, String model, int yearOfProduction) {
        this.Brand = brand;
        this.Model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Transport(String brand, String model, int yearOfProduction, String countryOfManufacture, String bodyColor) {
        Brand = brand;
        Model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfManufacture = countryOfManufacture;
        this.bodyColor = bodyColor;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public String getbrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        if (model== null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        Model = model;
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
}
