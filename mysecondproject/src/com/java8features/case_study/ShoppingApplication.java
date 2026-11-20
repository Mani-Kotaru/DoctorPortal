package com.java8features.case_study;


import java.util.*;
import java.util.stream.*;

class Product1 {
    private String name;
    private String category;
    private double price;
    private double rating;

    public Product1(String name, String category,
                   double price, double rating) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " | " + category
                    + " | Rs." + price
                    + " | Rating: " + rating;
    }
}

public class ShoppingApplication {
    public static void main(String[] args) {

        List<Product1> products = Arrays.asList(
            new Product1("Laptop", "Electronics", 55000.0, 4.5),
            new Product1("Mouse", "Electronics", 800.0, 4.3),
            new Product1("Keyboard", "Electronics", 1500.0, 4.6),
            new Product1("Headphones", "Electronics", 1800.0, 4.1),
            new Product1("Bottle", "Home", 500.0, 3.8),
            new Product1("Smartphone", "Electronics", 25000.0, 4.8)
        );

        // 1. Products below Rs.2000 with rating above 4.0
        System.out.println("Products below Rs.2000 with rating above 4.0:");

        products.stream()
                .filter(p -> p.getPrice() < 2000
                          && p.getRating() > 4.0)
                .forEach(System.out::println);

        // 2. All products sorted by rating in descending order
        System.out.println("\nAll products sorted by rating:");

        products.stream()
                .sorted((a,b)->Double.compare(b.getRating(),a.getRating()))
                .forEach(System.out::println);

        // 3. Find the most expensive product
        System.out.println("\nMost expensive product:");
               
               Product1 prod= products.stream()
                        .sorted((a,b)->Double.compare(b.getPrice(),a.getPrice()))
                        .findFirst()
                        .orElse(null);
               System.out.println(prod);
               
                   
    // 4. Calculate the average price of all products
        double averagePrice =  products.stream()
                .mapToDouble(a->a.getPrice())
                .average()
                .orElse(0.0);

        System.out.printf(
                "\nAverage price of all products: Rs.%.2f%n",
                averagePrice);
    }
}
