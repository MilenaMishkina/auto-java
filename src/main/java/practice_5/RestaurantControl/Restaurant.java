package practice_5.RestaurantControl;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Meal> menu = new ArrayList<>();

    public void showMenu() {
        for (Meal meal : menu) {
            System.out.println(meal);
        }
    }

    public void getInfo(Meal meal) {
        meal.getDescription();
    }

    public void addMeal(Meal meal) {
        menu.add(meal);
    }

}
