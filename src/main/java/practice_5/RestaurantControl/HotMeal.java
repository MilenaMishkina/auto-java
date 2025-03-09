package practice_5.RestaurantControl;

public class HotMeal extends Meal{
    private float temperature;

    public HotMeal(String name, float price, float temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return this.temperature;
    }

    @Override
    void getDescription(){
        System.out.println("Название горячего блюда: " + getMealName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Температура готового блюда: " + getTemperature());
    }
}
