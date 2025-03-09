package practice_5.Aquarium;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark("Тигровая акула");
        Aquarium aqua = new Aquarium();

        aqua.addFish(shark);
        aqua.getInfo(shark);
        aqua.movementInfo(shark);
    }
}
