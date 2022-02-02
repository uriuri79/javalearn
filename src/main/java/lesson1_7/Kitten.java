package lesson1_7;

public class Kitten {

    private String name;
    private int appetite;
    private boolean notHungry;


    public Kitten(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        notHungry = false;
    }

    public void eat(Plate p) {
        if (p.food > appetite) {
            p.decreaseFood(appetite);
            notHungry = true;
        } else {
            System.out.println("For " + name + " food not enough!");
            notHungry = false;
        }
    }

    public void infoAppetite () {
        if (notHungry == false) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
