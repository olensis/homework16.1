package animals;

import java.util.Objects;

public class Flightless  extends  Birds{
    private String typeOfMovement;



    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank())
            System.out.println("Неверное значение");
        this.typeOfMovement = typeOfMovement;
    }
    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    protected void go() {
        super.go();
    }

    @Override
    protected void eat() {
        super.eat();
    }

    protected void walk() {
        System.out.println(" Я гуляю ");
    }
    public void  printFlightless (){
        System.out.println(" Данные о животном: " + getName() +  " " + getAge()+ " лет " + " живет в " +  getLivingEnvironment() +  " тип передвижения  "  +  getTypeOfMovement () + " относится к классу" + getClass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeOfMovement.equals(that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}

