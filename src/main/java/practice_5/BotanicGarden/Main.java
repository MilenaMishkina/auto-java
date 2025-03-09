package practice_5.BotanicGarden;

public class Main {
    public static void main(String[] args) {
        Cactus cactus = new Cactus("Кактус обыкновенный", false, false);
        GardenControl garden = new GardenControl();

        garden.addPlant(cactus);
        garden.watering(cactus);
        garden.toCare(cactus);
    }
}
