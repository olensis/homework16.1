package animals;

import java.util.Objects;

public abstract class   Animals {
    public String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
        if (name== null || name.isEmpty() || name.isBlank())
            System.out.println("Неверное значение");
        if (age == 0 || age <0 )
            System.out.println("Неверное значение");


    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected  void  go (){

    }
    protected  void eat(){

    }

    protected  void slip(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
