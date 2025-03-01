package practice_5.zoo;

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
