package transport;

public class Train extends Transport {
    private  int thePriceOfTheTrip;
    private  int travelTime;
    private  String nameOfTheDepartureStation;
    private  String finalStop;
    private  int numberOfWagons;

    public Train(String brand, String model, int yearOfProduction) {

        super(brand, model, yearOfProduction);
    }


 //   public  Train (int thePriceOfTheTrip,String NameOfTheDepartureStation,String finalStop, int numberOfWagons){
  //      super();

 //   }
    public  Train (String brand, String model, int yearOfProduction ,String countryOfManufacture,int thePriceOfTheTrip,String nameOfTheDepartureStation,String finalStop, int numberOfWagons, int maximumMovementSpeed){
       super(brand,model,yearOfProduction,countryOfManufacture,maximumMovementSpeed);
       this.thePriceOfTheTrip =thePriceOfTheTrip;
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        this.travelTime = travelTime;
       this.numberOfWagons=numberOfWagons;
       this.finalStop=finalStop;



    }

    public Train(String brand, String model, int yearOfProduction, String countryOfManufacture, String bodyColor) {
        super(brand, model, yearOfProduction, countryOfManufacture, bodyColor);


    }

    public int getThePriceOfTheTrip() {
        return thePriceOfTheTrip;
    }

    public void setThePriceOfTheTrip(int thePriceOfTheTrip) {
        if (thePriceOfTheTrip <= 0 )
            System.out.println("Неверное значение");
        this.thePriceOfTheTrip = thePriceOfTheTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        if (travelTime <= 0 )
            System.out.println("Неверное значение");
        this.travelTime = travelTime;
    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        if (nameOfTheDepartureStation == null || nameOfTheDepartureStation.isEmpty() || nameOfTheDepartureStation.isBlank())
            System.out.println("Неверное значение");
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;

    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop == null || finalStop.isEmpty() || finalStop.isBlank())
            System.out.println("Неверное значение");
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0 )
            System.out.println("Неверное значение");
        this.numberOfWagons = numberOfWagons;
    }
    public void train(){
        System.out.println("Поезд " + getbrand() + " модель " + getModel() + " года выпуска " + getYearOfProduction() + " скорость передвижения " + getMaximumMovementSpeed() + " отходит от " + getNameOfTheDepartureStation() + " прибывает на " + getFinalStop() + " цена поездки " + getThePriceOfTheTrip() + " у поезда " + getNumberOfWagons() + " вагонов");
    }

    public void refill(){
        System.out.println(" нужно заправлять дизелем ");

    }


}
