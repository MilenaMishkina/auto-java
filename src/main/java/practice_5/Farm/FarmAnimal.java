package practice_5.Farm;

public abstract class FarmAnimal {
    private String name;

    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract void feed();
    abstract void clean();
    abstract void care();
    abstract void getInfo();
}

