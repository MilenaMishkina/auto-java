package practice_5.Museum;

public abstract class Exhibit {
    private String name;
    private boolean needWaterControl;
    private boolean needTemperatureChecking;
    private boolean needRestoration;
    private int creatingYear;
    private String author;

    public Exhibit(String name, boolean needRestoration, boolean needWaterControl, boolean needTemperatureChecking, int creatingYear, String author) {
        this.name = name;
        this.needRestoration = needRestoration;
        this.needWaterControl = needWaterControl;
        this.needTemperatureChecking = needTemperatureChecking;
        this.creatingYear = creatingYear;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public boolean isNeedWaterControl() {
        return this.needWaterControl;
    }

    public boolean isNeedTemperatureChecking() {
        return this.needTemperatureChecking;
    }

    public boolean isNeedRestoration() {
        return this.needRestoration;
    }

    public int getCreatingYear() {
        return this.creatingYear;
    }

    public String getAuthor() {
        return this.author;
    }

    abstract void info();
    abstract void maintain();
    abstract void move();
}
