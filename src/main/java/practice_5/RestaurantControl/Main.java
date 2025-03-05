package practice_5.RestaurantControl;

public class Main {
    public static void main(String[] args) {
        Meal drink = new Cola("Coco-cola");
        Meal hotMeal = new Potato("Жареная картошка");
        drink.setVolume(200);
        hotMeal.setTemperature(180);

        Restaurant rest = new Restaurant();

        rest.addMeal(drink);
        rest.addMeal(hotMeal);

        rest.info(drink);
        rest.info(hotMeal);
        rest.menu();
    }
}
