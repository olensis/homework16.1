package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment= livingEnvironment;
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank())
            System.out.println("Неверное значение");
    }

    @Override
    protected void go() {
        System.out.println(" Могу и плавать и ходить");

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    protected void eat() {
        System.out.println(" Ем");

    }
    protected  void hunting(){
        System.out.println(" Я охочусь");
    }
    public void   printAmphibians (){
        System.out.println(" Данные о животном: " + getName() +  " " + getAge()+ " лет " + " живет в " +  getLivingEnvironment() + " относится к классу" + getClass()  );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
