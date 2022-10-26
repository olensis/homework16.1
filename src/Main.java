import transport.Car;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        //  Car Lada = new Car("Lada", " Granta", 1.7, "Желтый", 2015, "Россия", "Механическая", "Седан", "A123BC164", 5,"Летняя",5,15000,1234567890);
        Car Audi = new Car("Audi", " A8 50 L TDI quattro", 3.0, "Черный", 2022, " Германия", " автомат", " седан", "111", 5,"Зимняя", 5,15000,"1234567890");
        Car BMW = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия", " автомат " , "  хэтчбек ", " а188аа 178", 4, " Зимняя", 5,15000,"1234567890");
        Car Kia= new Car(" Kia", " Sportage 4-го поколения", 2.4, " Красный", 2018, "Южная Корея"," автомат " , "  хэтчбек ", " о188оо 171", 5, " Зимняя" , 5,15000,"1234567890");
        Car Hyundai = new Car("Hyundai", " Avante", 1.6 , "Оранжевый", 2016, "Южная Корея", " Механическая " , " седан ", "000" , 5, "Летняя", 5,15000,"1234567890");
      //  Car.Key NN =  new Car.Key(null, "Без ключа");
        Car.Insurance Hyundai1 = new Car.Insurance(5,15000,"123");



        Hyundai.cars();
       // Lada.number();
       // Lada.SeasonTires();
        Kia.cars();
        BMW.cars();
        Audi.cars();
        BMW.getKey();
      //  Lada.cars();

    }
}

