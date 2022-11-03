import animals.Flightless;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Car.Insurance Audi1 = new Car.Insurance(5, 1500, "11" );
         Car Lada = new Car("Lada", " Granta", 1.7, "Желтый", 2015, "Россия", "Механическая", "Седан", "A123BC164", 5,"Летняя",5,15000,"1234567890", Audi1);
        //  Car Audi = new Car("Audi", " A8 50 L TDI quattro", 3.0, "Черный", 2022, " Германия", " автомат", " седан", "111", 5,"Зимняя", 5,15000,"1234567890", " " );
      //  Car BMW = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия", " автомат " , "  хэтчбек ", " а188аа 178", 4, " Зимняя", 5,15000,"1234567890");
        //Car Kia= new Car(" Kia", " Sportage 4-го поколения", 2.4, " Красный", 2018, "Южная Корея"," автомат " , "  хэтчбек ", " о188оо 171", 5, " Зимняя" , 5,15000,"1234567890");
        // Car Hyundai = new Car("Hyundai", " Avante", 1.6 , "Оранжевый", 2016, "Южная Корея", " Механическая " , " седан ", "000" , 5, "Летняя", 5,15000,"1234567890");
      // Audi.cars();
      //  Hyundai.cars();
      //  Hyundai.refill();
     //   Lada.number();
       // Lada.SeasonTires();
      //  Kia.cars();
        //BMW.cars();
      // Audi.cars();
        //BMW.getKey();

        System.out.println(" Данные по страховке" +  Audi1);
        Audi1.toString();


      //  Train lactochka = new Train("Ласточка", " B-901 ", 2011, "Россия", 3500,"Белорусского вокзала"," Минск-Пассажирский", 11, 310);
      //  Train leningrad = new Train("Ленинград", "D-125" , 2019, "Россия",1700,"Ленинградского вокзала", "Ленинград-Пассажирский", 8,270);
      //  lactochka.train();
       // lactochka.refill();
       // leningrad.train();
//        leningrad.refill();

//       Bus mersedes = new Bus("Мерседес", "Модель 225",2020);
//       Bus lada = new Bus("Лада", "Модель 885", 2018);
//       Bus audi = new Bus("Ауди", "Модель 1", 2015);
//       audi.bus();
//       audi.refill();
//       mersedes.bus();
//       mersedes.refill();
//       lada.bus();
//       lada.refill();




    }
}

