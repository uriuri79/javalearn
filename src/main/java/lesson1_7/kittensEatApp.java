package lesson1_7;

public class kittensEatApp {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Kitten [] kittens = new Kitten[5];
        kittens[0] = new Kitten("Barsik", 12);
        kittens[1] = new Kitten("Murzik", 35);
        kittens[2] = new Kitten("Vaska", 10);
        kittens[3] = new Kitten("Marta", 15);
        kittens[4] = new Kitten("Mourka", 45);

        for (Kitten kitten : kittens) {
            kitten.infoAppetite();
            kitten.eat(plate);
            plate.info();
            kitten.infoAppetite();
        }
   }
}
