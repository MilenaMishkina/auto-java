package practice_5.control_pet;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с фантиком");
    }

    @Override
    void feed() {
        System.out.println("Кошка есть влажный корм");
    }

    @Override
    void walking() {
        System.out.println("Кошка не гуляет на улице");
    }

}
