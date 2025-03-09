package practice_5.AmusementPark;

public class AttractionControl {
    public void start(Attraction attraction) {
        attraction.start();
    }

    public void checkSafety(Attraction attraction) {
        attraction.checkSafety();
    }

    public void getInfo(Attraction attraction) {
        attraction.info();
    }

    public void stop(Attraction attraction) {
        attraction.stop();
    }
}
