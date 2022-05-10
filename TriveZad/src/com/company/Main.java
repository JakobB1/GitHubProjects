package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ShoppingCart shoppingCart = new ShoppingCart();
        InventoryManager inventoryManager = new InventoryManager(inventory);
        ShoppingCartManager shoppingCartManager = new ShoppingCartManager(inventory, shoppingCart);
        Scanner scanner = new Scanner(System.in);

            try {
                while(inventoryManager.parseLine(scanner.nextLine()));
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }


            try {
                while(shoppingCartManager.parseLine(scanner.nextLine()));
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
    }
}
