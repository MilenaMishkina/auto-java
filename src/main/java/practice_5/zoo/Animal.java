package practice_5.zoo;


import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private String animal;

    public Animal (String name) {
        animal = name;
    }

    public String getAnimal() {
        return animal;
    }

    public abstract void Move();

    public abstract void Sound();
}

class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void Move() {
        System.out.println("Слон ходит");
    }

    @Override
    public void Sound() {
        System.out.println("Слон трубит");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void Move() {
        System.out.println("Птица летает");
    }

    @Override
    public void Sound() {
        System.out.println("Птица чирикает");
    }
}

class Zoo {
    private List<Animal> animalZoo = new ArrayList<>();

   public void addAnimal(Animal animal) {
       animalZoo.add(animal);
   }

   public void getAnimalInfo() {
       for (Animal animal: animalZoo) {
           System.out.println("Животное: " + animal.getAnimal());
           animal.Move();
           animal.Sound();
       }
   }
}
