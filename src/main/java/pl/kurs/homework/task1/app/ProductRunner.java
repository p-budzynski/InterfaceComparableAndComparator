package pl.kurs.homework.task1.app;

import pl.kurs.homework.task1.model.Product;

import java.util.Arrays;

public class ProductRunner {
    public static void main(String[] args) {

        Product[] products = {
                new Product("Lemon", 125, "Gambin", 15.99, 15, "Turkey", 19),
                new Product("Lemon", 165, "Gambin", 19.99, 15, "Italy", 19),
                new Product("Lemon", 95, "LemonsFactory", 5.99, 15, "Turkey", 19),
                new Product("Lemon", 125, "LemonsFactory", 15.99, 15, "Italy", 1),
                new Product("Lemon", 125, "LemonsFactory", 15.99, 15, "Spain", 1),
                new Product("Lemon", 125, "LemonsFactory", 15.99, 15, "Spain", 7),
                new Product("Apple", 170, "Jab-Pol", 7.5, 12, "Poland", 23),
                new Product("Apple", 170, "Tarczyn", 6.5, 12, "Poland", 23),
                new Product("Apple", 110, "Jab-Pol", 8.4, 12, "Poland", 23),
                new Product("Apple", 170, "Jab-Pol", 9.8, 12, "Poland", 19),
                new Product("Apple", 110, "Jab-Pol", 8.4, 12, "Poland", 19),
                new Product("Apple", 110, "Jab-Pol", 8.4, 12, "Poland", 12),
                new Product("Banana", 5000, "African-Bananas", 42.50, 9, "Uganda", 7),
                new Product("Banana", 5000, "Coco-Banana", 42.50, 5, "Columbia", 7),
                new Product("Banana", 750, "African-Bananas", 14.80, 5, "Uganda", 11),
                new Product("Banana", 750, "Coco-Banana", 14.80, 5, "Columbia", 7),
                new Product("Banana", 5000, "Coco-Banana", 39.50, 5, "Columbia", 5),
                new Product("Banana", 1500, "African-Bananas", 23.50, 4, "Uganda", 7),
        };

        Arrays.sort(products);

        for (Product p : products) {
            System.out.println(p);
        }

    }
}
