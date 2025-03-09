package practice_5.BotanicGarden;

public class GardenControl {
    private Plant plant;

    public void watering(Plant plant) {
        plant.water();
    }

    public void toCare(Plant plant) {
        plant.care();
    }

    public void addPlant(Plant plant) {
        this.plant = plant;
    }
}
