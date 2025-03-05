package practice_5.control_pet;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Jack");
        Pet cat = new Cat("Meow");

        PetControlSystem petControlSystem = new PetControlSystem();

        petControlSystem.addPet(cat);
        petControlSystem.addPet(dog);

        petControlSystem.feedPet(cat);
        petControlSystem.feedPet(dog);

        petControlSystem.playing(cat);
        petControlSystem.playing(dog);

        petControlSystem.walk(cat);
        petControlSystem.walk(dog);
    }
}
