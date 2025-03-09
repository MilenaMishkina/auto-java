package practice_5.RestaurantControl;

public class Drinks extends Meal {
    private float volume;

    public Drinks(String name, float price, float volume) {
        super(name, price);
        this.volume = volume;
    }

    public float getVolume() {
        return this.volume;
    }

    @Override
    void getDescription(){
        System.out.println("Название горячего блюда: " + getMealName());
        System.out.println("Цена: " + getPrice());
        System.out.println("Объем напитка: " + getVolume());
    }

}
