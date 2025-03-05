package practice_5.RestaurantControl;

public class Potato extends Meal{

    public Potato(String name) {
        super(name);
    }

    @Override
    void getDescription() {
        System.out.println("Название:" + getMealName());
        System.out.println("Температура:" + getTemperature());
        System.out.println("У горячего блюда нет объема");
    }
}