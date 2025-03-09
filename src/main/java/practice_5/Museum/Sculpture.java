package practice_5.Museum;

public class Sculpture extends Exhibit{

    public Sculpture(String name, boolean needRestoration, boolean needWaterControl, boolean needTemperatureChecking, int creatingYear, String author) {
        super(name, needRestoration, needWaterControl, needTemperatureChecking, creatingYear, author);
    }

    @Override
    void info() {
        System.out.println("Название: " + getName() + ". Год создания: " + getCreatingYear() + ". Автор: " + getAuthor() );
    }

    @Override
    void maintain() {
        if (isNeedRestoration()) {
            System.out.println("Статуя отреставрирована");
        } else {
            System.out.println("Статуя нуждается в рестоврации");
        }
    }

    @Override
    void move() {
        System.out.println("Статуя перенесена");
    }
}
