package practice_5.Farm;

public class Cow extends FarmAnimal{
    private float milkAmount;

    public Cow(String name, int milkAmount) {
        super(name);
        this.milkAmount = milkAmount;
    }

    @Override
    void feed() {
        System.out.println("Кормление коровы сеном");
    }

    @Override
    void clean() {
        System.out.println("Чистка коровника");
    }

    @Override
    void care() {
        System.out.println("Выпас коровы на лугу");
    }

    protected float getMilk() {
        return this.milkAmount;
    };

    public void getInfo() {
        System.out.println("Имя коровы: " + getName());
        System.out.println("Получено: " + getMilk() + "л молока");
    }
}
