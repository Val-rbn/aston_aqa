package lesson4.task1;

public class Main {
    public static void main(String[] args) {
        //  Создание животных
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        //  Бег и плавание
        System.out.println("\n---- Бег и плавание ----");
        dogBobik.run(150);
        dogBobik.run(600);
        dogBobik.swim(10);
        dogBobik.swim(25);
        catMurzik.run(100);
        catMurzik.run(300);
        catMurzik.swim(5);

        Bowl bowl = new Bowl(20);

       // Создание массива котов
        Cat[] cats = {
                new Cat("Барсик"),
                catMurzik,
                new Cat("Рыжик")
        };
        //  Подсчёт животных
        System.out.println("\n---- Количество животных ----");
        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Собак: " + Dog.getCount());
        System.out.println("Котов: " + Cat.getCount());

        // Кормление котов
        System.out.println("\n---- Кормление котов ----");
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl, 10);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].printSatiety();
        }

        // Добавление еды в миску
        System.out.println("\n---- Еда в миске ----");
        bowl.printFood();
        System.out.println("Добавляем 15 единиц еды");
        bowl.addFood(15);
        bowl.printFood();
    }
}
