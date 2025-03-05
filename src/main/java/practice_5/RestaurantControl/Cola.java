package practice_5.RestaurantControl;

public class Cola extends Meal{
    public Cola(String name) {
        super(name);
    }

    @Override
    void getDescription() {
        System.out.println("Название:" + getMealName());
        System.out.println("Объем:" + getVolume());
        System.out.println("У напитка нет температуры");
    }
}
