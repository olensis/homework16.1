package animals;

import java.util.Objects;

public  class  Mammals extends Animals {

    private String livingEnvironment;
     private   int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.speed = speed;
        if (speed == 0 || age <0 )
            System.out.println("Неверное значение");
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank())
            System.out.println("Неверное значение");

    }

    protected void walk() {
        System.out.println(" Я гуляю");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    protected void go() {

    }
    @Override
    protected void eat() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }
}
