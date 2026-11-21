package lesson3;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n------- ЗАДАНИЕ 1 -------");
        Product product1 = new Product(
                "Samsung S25 Ultra",
                "01.02.2025",
                "Samsung Corp.",
                "Korea",
                5599,
                true
        );
        product1.printInfo();
        System.out.println("\n------- ЗАДАНИЕ 2 -------");

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product( "iPhone 16", "15.09.2024",
                "Apple", "USA", 4500, false);

        productsArray[2] = new Product( "iPhone 17", "12.10.2025",
                "Apple", "USA", 5400, false);

        productsArray[3] = new Product( "Xiaomi 14 Ultra", "18.07.2024",
                "Xiaomi", "China", 3990, true);

        productsArray[4] = new Product( "Samsung Galaxy S24 Ultra", "11.03.2024",
                "Samsung Corp.", "Korea", 4999, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println();
        }
        System.out.println("------- ЗАДАНИЕ 3 -------");

        Park park = new Park();
        Park.Attraction Attraction1 = park. new Attraction("Колесо обозрения", "10:00-21:00", 600);
        Attraction1.printInfo();
    }
}
