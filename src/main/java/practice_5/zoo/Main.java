package practice_5.zoo;

public class Main{
    public static void main(String[] args) {
        Zoo newZoo = new Zoo();

        Animal elephant = new Elephant("Слон");
        Animal bird = new Bird("Птица");

        newZoo.addAnimal(elephant);
        newZoo.addAnimal(bird);

        newZoo.getAnimalInfo();
    }
}
