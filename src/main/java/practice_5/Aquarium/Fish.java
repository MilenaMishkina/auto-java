package practice_5.Aquarium;

public abstract class Fish {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    abstract void info();
    abstract void move();
}
