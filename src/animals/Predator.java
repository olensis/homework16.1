package animals;

import java.util.Objects;

public class Predator extends Mammals{
    private String typeOfFood;

    public Predator(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank())
            System.out.println("Неверное значение");
           this.typeOfFood =typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    protected void go() {
        System.out.println( " Я хожу где хочу");

    }

    protected void eat() {
        System.out.println( " Я ем мясо");

    }
    protected void hunting(){
        System.out.println(" Я охочусь");
    }
    public void  printPredator (){
        System.out.println(" Данные о животном: " + getName() +  " " + getAge()+ " лет " + " живет в " +  getLivingEnvironment() + " скорость " +  getSpeed() + " питается "  +  getTypeOfFood() + " относится к классу" + getClass());;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
