package animals;

import java.util.Objects;

public class Birds extends Animals {

    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment= livingEnvironment;
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank())
            System.out.println("Неверное значение");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    protected void go() {
        System.out.println( " Летаю ");

    }


    @Override
    protected void eat() {
        System.out.println(" Я ем");

    }
    protected  void hunting(){
        System.out.println(" Я охочусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
