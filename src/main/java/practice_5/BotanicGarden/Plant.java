package practice_5.BotanicGarden;

public abstract class Plant {
    private String name;
    private boolean needShade;
    private boolean needWatering;

    public Plant(String name, boolean needShade, boolean needWatering) {
        this.name = name;
        this.needShade = needShade;
        this.needWatering = needWatering;
    }

    public String getName() {
        return this.name;
    }

    public boolean isNeedWatering() {
        return this.needWatering;
    }

    public boolean isNeedShade() {
        return this.needShade;
    }

    abstract void water();
    abstract void care();
}
