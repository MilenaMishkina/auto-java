package practice_5.control_pet;

import java.util.ArrayList;
import java.util.List;

public class PetControlSystem {
    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void feedPet(Pet pet) {
        pet.feed();
    }

    public void playing(Pet pet) {
        pet.play();
    }

    public void walk(Pet pet) {
        pet.walking();
    }
}
