package animals;

public class Main {
    public static void main(String[] args) {
        // травоядные
        Herbivores giraffe = new Herbivores("Жираф", 11, "пустыня", 20, "травоядное");
        Herbivores gazelle = new Herbivores("Газель", 5, "горы", 25, " травоядное" );
        Herbivores horse = new Herbivores("Лошадь", 9, " степь", 45, " травоядное");
        horse.herbivores();
        gazelle.herbivores();
        giraffe.herbivores();
        // хищники
        Predator hyena = new Predator("Гиена", 6,"степь", 55, "хищик");
        Predator tiger = new Predator("Тигр", 7, "лес" , 60, " хищник");
        Predator bear = new Predator(" Медведь", 10, " лес", 50, " хищник");
        hyena.predator();
        tiger.predator();
        bear.predator();
        // земноводные
        Amphibians frog = new Amphibians(" Лягушка", 1," пресная вода");
        Amphibians grassSnake = new Amphibians( " Уж ", 1, " пресная вода ");
        grassSnake.amphibians();
        frog.amphibians();
        // нелетающие птицы
        Flightless peacock = new Flightless(" Павлин", 2, " пустыня", " по суше");
        Flightless penguin = new Flightless("Пингвин", 1, "льды", " по суше");
        Flightless dodo = new Flightless("Додо", 3, "пустыня", " по суше");
        dodo.flightless();
        peacock.flightless();
        penguin.flightless();

        // летающие птицы
        Flying seagull = new Flying("Чайка", 1, "у моря", " по воздуху");
        Flying albatross = new Flying(" Альбатрос", 2, " у моря ", " по водуху");
        Flying falcon = new Flying( " Сокол", 3, " у гор", " по воздуху");
        seagull.flying();
        albatross.flying();
        falcon.flying();





    }
}
