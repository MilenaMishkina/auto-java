package practice_5.zoo;


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

