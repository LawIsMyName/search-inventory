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

            Product product = new Product(id, name, price);
            inventory.add(product);
        }







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