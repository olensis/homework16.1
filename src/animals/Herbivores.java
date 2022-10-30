package animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank())
            System.out.println("Неверное значение");
        this.typeOfFood =typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    protected void graze() {
        System.out.println("Я пасусь");
    }

    protected void go() {

    }

    protected void eat() {

    }
     public void  herbivores (){
        System.out.println(" Данные о животном: " + getName() +  " " + getAge()+ " лет " + " живет в " +  getLivingEnvironment() + " скорость " +  getSpeed() + " питается "  +  getTypeOfFood() + " относится к классу" + getClass());;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
