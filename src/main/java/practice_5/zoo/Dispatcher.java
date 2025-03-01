package practice_5.zoo;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Animal> animalZoo = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalZoo.add(animal);
    }

    public void getAnimalInfo() {
        for (Animal animal : animalZoo) {
            System.out.println("Животное: " + animal.getAnimal());
            animal.Move();
            animal.Sound();
        }
    }
}
