package animals;

import java.util.Objects;

public class Flying  extends  Birds{
    private String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
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
    }

    @Override
    protected void eat() {
    }
    protected void walk() {
        System.out.println(" Я летаю ");
    }
    public void  flying (){
        System.out.println(" Данные о животном: " + getName() +  " " + getAge()+ " лет " + " живет в " +  getLivingEnvironment() +  " тип передвижения  "  +  getTypeOfMovement () + " относится к классу" + getClass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
