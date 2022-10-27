package transport;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {

    public static class Key {
        private String remoteLaunch;
        private String keylessAccess;

        public Key(String remoteLaunch, String keylessAccess) {
           this.remoteLaunch = remoteLaunch;
            this.keylessAccess = keylessAccess;

            if (remoteLaunch == null || remoteLaunch.isEmpty() || remoteLaunch.isBlank()) {
                System.out.println("Данные введены неверно");
            }
            {
                if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                    System.out.println("Данные введены неверно");
                }
            }
        }
    }
    public static class Insurance{
        private long validityPeriod;
        private int cost;
        private  String number;
        public Insurance (long validityPeriod,int cost,String number) {
            this.validityPeriod = validityPeriod;
            this.cost = cost;
            this.number = number;
            if (validityPeriod == 0 || validityPeriod < 0) {
                System.out.println("Данные введены неверно");
            }
            {
                if (cost == 0 || cost < 0) {
                    System.out.println("Данные введены неверно");
                }
                if (number == null || number.isEmpty() || number.isBlank()) {
                    System.out.println("Данные введены неверно");
                }
            }

        }


    }
        private  Insurance insurance;
        private Key key;
        public double engineCapacity;
        public String transmission;
        private String bodyType;
        public String registrationNumber;
        private int numberOfSeats;
        public String rubber;
        private   int maximumMovementSpeed;


        public Car(String brand, String model, double engineCapacity, String bodyColor, int yearOfProduction, String countryOfManufacture, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String rubber,long validityPeriod,int cost,String number) {
            super(brand, model, yearOfProduction, countryOfManufacture, bodyColor);

        }

        public String getBodyType() {
            return bodyType;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public double getEngineCapacity() {
            return engineCapacity;
        }

        public void setEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
        }


        public String getTransmission() {
            return transmission;
        }

        public void setTransmission(String transmission) {
            if (transmission == null || transmission.isEmpty() || transmission.isBlank())
                System.out.println("Механическая");
            this.transmission = transmission;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public void setRegistrationNumber(String registrationNumber) {
            if (registrationNumber == null)
                System.out.println("а123бв 164");
            this.registrationNumber = registrationNumber;
        }
        public String getRubber() {
            return rubber;
        }

        public void setRubber(String rubber) {
            if (rubber == null || rubber.isEmpty() || rubber.isBlank())
                System.out.println("Летние");
            this.rubber = rubber;
        }

        public Key getKey() {
            return key;
        }

    public Insurance getInsurance() {
        return insurance;
    }

    public void cars() {
            System.out.println("Марка автомобиля " + getbrand() + ", модель " + getModel()+ ", год выпуска " + getYearOfProduction() + ", произведена в " + getCountryOfManufacture() + ", объем двигателя " + engineCapacity + " л., цвет кузова " + getBodyColor() + " коробка передач " + transmission + " тип кузова " + bodyType + " регистрационный номер " + registrationNumber + " кол-во мест " + numberOfSeats + " резина " + rubber + " данные по страховке  " );

        }

        public void SeasonTires() {
            int currentMonth = LocalDate.now().getMonthValue();
            if (currentMonth <= 4 || currentMonth >= 10) {
                System.out.println("Нужна зимняя резина");
            } else {
                System.out.println("Нужна летняя резина");
            }
        }

        public void number() {

            Matcher m = Pattern.compile("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d").matcher(registrationNumber);
            if (m.find()) {
                System.out.println(registrationNumber + " действительный регистрационный номер");
            } else {
                System.out.println(registrationNumber + " не существующий регистрационный номер");
            }
        }
        public void key (){
            System.out.println("Доступ" + getKey());

    }
    public void insurance (){
        System.out.println("" + getInsurance());

    }
    public boolean validityPeriod(LocalDateTime password_changed_at, long validityPeriod) {

         long Period = Duration.between(password_changed_at, LocalDate.now()).toDays();

        if (Period < Period -validityPeriod ) {
            System.out.println( "Срочно сделать страховку");
            return false;
        } else {
            return true;
        }
    }
    public void numberInsurance(String number) {
        Matcher m = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d").matcher(number);
        if (m.find()) {
            System.out.println(number + " действительный регистрационный номер");
        } else {
            System.out.println(registrationNumber + " номер страховки некорректен ");
        }

    }
    }

