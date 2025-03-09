package practice_5.RestaurantControl;

public abstract class Meal {
    private String name;
    private float price;

    public Meal(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getMealName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    abstract void getDescription();
}
