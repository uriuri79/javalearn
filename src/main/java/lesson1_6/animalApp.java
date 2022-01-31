package lesson1_6;

public class animalApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        dog1.run(150);
        dog1.swim(5);
        dog2.run(700);
        dog2.swim(15);

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        cat1.run(100);
        cat1.swim(10);
        cat2.run(300);
        cat2.swim(5);
    }
}
