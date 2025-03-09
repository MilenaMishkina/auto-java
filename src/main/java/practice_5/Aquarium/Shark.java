package practice_5.Aquarium;

public class Shark extends Fish{

    public Shark(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("Название: " + getName());
    }

    @Override
    void move() {
        System.out.println(getName() +  "плавает быстро и агрессивно");
    }
}
