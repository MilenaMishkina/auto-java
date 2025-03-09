package practice_5.Farm;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow("Murka", 10);
        FarmControl farm = new FarmControl();

        farm.getInfoAboutPet(cow);
        farm.feed(cow);
        farm.care(cow);
        farm.clean(cow);
    }
}
