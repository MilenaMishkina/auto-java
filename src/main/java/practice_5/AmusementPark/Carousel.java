package practice_5.AmusementPark;

public class Carousel extends Attraction{
    public Carousel(String name, boolean needSafetyChecking, boolean needTechnicalChecking, float price) {
        super(name, needSafetyChecking, needTechnicalChecking, price);
    }

    @Override
    void info() {
        System.out.println("Название аттракциона: " + getName());
        System.out.println("Цена за одно катание: " + getPrice() + "рублей") ;
    }

    @Override
    void start() {
        System.out.println("Запущена " + getName());
    }

    @Override
    void stop() {
        System.out.println("Остановлена " + getName());

    }

    @Override
    void checkSafety() {
        if (isNeedTechnicalChecking()) {
            System.out.println("Проведен техосмотр");
        } else {
            System.out.println("Для данного аттракциона предусмотрен частный тех осмотр");
        }
    }

}
