package practice_5.RestaurantControl;

public abstract class Meal {
    private String mealName;
    private float volume;
    private float temperature;

    public Meal(String mealName) {
        this.mealName = mealName;
    }

    protected Meal() {
    }

    public String getMealName() {
        return this.mealName;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    abstract void getDescription();
}
