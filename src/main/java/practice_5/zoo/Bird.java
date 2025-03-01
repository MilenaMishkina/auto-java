package practice_5.zoo;

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
