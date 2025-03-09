package practice_5.Museum;

public class Main {
    public static void main(String[] args) {
        Sculpture sculpture1 = new Sculpture(
                "Sculpture of King I",
                true,
                false,
                false,
                1834,
                "Ivan Ivanov");

        Sculpture sculpture2 = new Sculpture(
                "Sculpture of King II",
                false,
                false,
                false,
                1835,
                "Ivan Petrov");
        MuseumControl museum = new MuseumControl();

        museum.getInfo(sculpture1);
        museum.getInfo(sculpture2);

        museum.moveExhibit(sculpture1);
        museum.toMaintain(sculpture2);
        museum.toMaintain(sculpture1);
    }


}
