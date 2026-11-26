package lesson4.task1;

public class Bowl {
    private int food;
    public Bowl(int food) {
        this.food = Math.max(0, food);
    }

    public boolean decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food = food - amount;
            return true;
        } else {
            return false;
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
    public void printFood() {
        System.out.println("Еды в миске: " + food);
    }
}

