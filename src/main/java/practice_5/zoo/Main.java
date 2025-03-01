package practice_5.zoo;

public class Main{
    public static void main(String[] args) {
        Dispatcher newZoo = new Dispatcher();

        Animal elephant = new Elephant("Слон");
        Animal bird = new Bird("Птица");

        newZoo.addAnimal(elephant);
        newZoo.addAnimal(bird);

        newZoo.getAnimalInfo();
    }
}
