package practice_5.RestaurantControl;

public class Main {
    public static void main(String[] args) {
        HotMeal potato = new HotMeal("Картошка фри", 300, 100);
        Drinks cola = new Drinks("Кока-кола", 100, 250);

        Restaurant rest = new Restaurant();

        rest.showMenu();

        rest.addMeal(potato);
        rest.addMeal(cola);

        rest.showMenu();
        rest.getInfo(potato);
        rest.getInfo(cola);
    }
}
