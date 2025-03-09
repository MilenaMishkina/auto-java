package practice_5.AmusementPark;

public abstract class Attraction {
    private String name;
    private boolean needSafetyChecking;
    private boolean needTechnicalChecking;
    private float price;

    public Attraction(String name, boolean needSafetyChecking, boolean needTechnicalChecking, float price) {
        this.name = name;
        this.needSafetyChecking = needSafetyChecking;
        this.needTechnicalChecking = needTechnicalChecking;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }

    public boolean isNeedSafetyChecking() {
        return this.needSafetyChecking;
    }

    public boolean isNeedTechnicalChecking() {
        return this.needTechnicalChecking;
    }

    public float getPrice() {
        return this.price;
    }

    abstract void info();
    abstract void start();
    abstract void stop();
    abstract void checkSafety();
}
