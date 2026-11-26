package lesson4.task1;

public class Cat extends Animal {

    private  static int count = 0;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
            System.out.println(name + " не умеет плавать.");
        }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            satiety = true;
        }
    }
    public void printSatiety() {
        System.out.println(name + " сыт: " + satiety);
    }
}