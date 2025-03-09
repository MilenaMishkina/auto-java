package practice_5.Museum;

public class MuseumControl {
    public void moveExhibit(Exhibit exhibit) {
        exhibit.move();
    }

    public void getInfo(Exhibit exhibit) {
        exhibit.info();
    }

    public void toMaintain(Exhibit exhibit) {
        exhibit.maintain();
    }
}
