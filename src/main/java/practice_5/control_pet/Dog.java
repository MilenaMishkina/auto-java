package practice_5.control_pet;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Собака играет с палочкой");
    }

    @Override
    void feed() {
        System.out.println("Собака есть сухой корм");
    }

    @Override
    void walking() {
        System.out.println("Собака гуляет на улице");
    }

}
