package practice_5.AmusementPark;

public class Main {
    public static void main(String[] args) {
        Carousel carousel = new Carousel("Детская карусель", false, true, 400);
        AttractionControl attractionControl = new AttractionControl();

        attractionControl.start(carousel);
        attractionControl.stop(carousel);
        attractionControl.checkSafety(carousel);
        attractionControl.getInfo(carousel);
    }
}
