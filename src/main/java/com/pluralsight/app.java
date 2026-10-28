package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class app {
    public static void main(String[] args) {

        // call from method
        ArrayList<Product> inventory = getInventory();

        // print for each product in the inventory
        displayInventory(inventory);

    }

    // method creating the list of products and the inventory
    public static ArrayList<Product> getInventory() {

    ArrayList<Product> inventory = new ArrayList<>();

        FileReader fileReader = new FileReader("inventory.csv");
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine();

        while (line != null) {

            String[] parts = line.split("\\|");

            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);


        }





    inventory.add(new Product(101, "Laptop", 799.99));
    inventory.add(new Product(102, "Keyboard", 49.99));
    inventory.add(new Product(103, "Mouse", 29.99));
    inventory.add(new Product(104, "Monitor", 199.99));
    inventory.add(new Product(105, "Headset", 89.99));

    return inventory;
}

    private static void displayInventory(ArrayList<Product> inventory) {
        for (Product product : inventory) {

            System.out.printf("%d | %s | $%.2f%n",
                    product.getId(),
                    product.getName(),
                    product.getPrice());
        }
    }
}