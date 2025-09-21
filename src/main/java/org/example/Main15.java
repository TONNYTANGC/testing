package org.example;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    //Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Cart {
    private List<Product> products = new ArrayList<>();

    // add product method
    public void addProduct(Product product) {
        products.add(product);
    }

    // remove product by name method
    public void removeProductByName (String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
            }
        }
    }

    // get total price method
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    // find most expensive product method
    public Product findMostExpensiveProduct() {
        Product mostExpensiveProduct = null;
        for (Product product : products) {
            if (mostExpensiveProduct == null || product.getPrice() > mostExpensiveProduct.getPrice()) {
                mostExpensiveProduct = product;
            }
        }
        return mostExpensiveProduct;
    }
}

public class Main15 {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product product1 = new Product(1, "Product 1", 10.0);
        Product product2 = new Product(2, "Product 2", 20.0);
        Product product3 = new Product(3, "Product 3", 30.0);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        System.out.println("Total price: " + cart.getTotalPrice());
        System.out.println("Most expensive product: " + cart.findMostExpensiveProduct().getName());

        cart.removeProductByName("Product 2");

        System.out.println("Total price after removing product 2: " + cart.getTotalPrice());
    }
}
