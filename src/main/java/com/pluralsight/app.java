package com.pluralsight;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {

    }

    public static ArrayList<Product> getInventory() {

    ArrayList<Product> inventory = new ArrayList<>();

    inventory.add(new Product(101, "Laptop", 799.99));
    inventory.add(new Product(102, "Keyboard", 49.99));
    inventory.add(new Product(103, "Mouse", 29.99));
    inventory.add(new Product(104, "Monitor", 199.99));
    inventory.add(new Product(105, "Headset", 89.99));

    return inventory;




}
    }