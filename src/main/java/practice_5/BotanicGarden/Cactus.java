package practice_5.BotanicGarden;

public class Cactus extends Plant{
    public Cactus(String name, boolean needWater, boolean needShade) {
        super(name, needWater, needShade);
    }

    @Override
    void water() {
        System.out.println("Поливать один раз в месяц");
    }

    @Override
    void care() {
        System.out.println("Передвинут на солнечную сторону");
    }
}
