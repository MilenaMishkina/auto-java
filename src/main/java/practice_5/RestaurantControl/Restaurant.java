package practice_5.RestaurantControl;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Meal> menu = new ArrayList<>();

    public void addMeal(Meal meal) {
        menu.add(meal);
    }

    public List menu() {
        return menu;
    }

    public void info(Meal meal) {
        meal.getDescription();
    }
}
