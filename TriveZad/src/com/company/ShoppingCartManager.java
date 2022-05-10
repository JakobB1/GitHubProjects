package com.company;

public class ShoppingCartManager {

    private Inventory inventory;
    private ShoppingCart shoppingCart;

    public ShoppingCartManager(Inventory inventory, ShoppingCart shoppingCart) {
        this.inventory = inventory;
        this.shoppingCart = shoppingCart;
    }

    public boolean parseLine(String line) throws Exception {
        String[] lineSegments = line.split(" ");
        switch (lineSegments[0]){
            case "ADD":
                try {
                    ProductItem productItem = inventory.takeItems(Integer.parseInt(lineSegments[1]), Double.parseDouble(lineSegments[2]));
                    shoppingCart.addItems(productItem.getItem(), productItem.getQuantity());
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case "REMOVE":
                try {
                    ProductItem productItem = shoppingCart.takeItems(Integer.parseInt(lineSegments[1]), Double.parseDouble(lineSegments[2]));
                    inventory.addItems(productItem.getItem(), productItem.getQuantity());
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case "CHECKOUT":
                shoppingCart.checkout();
                break;
            case "END":
                return false;
            default:
                throw new Exception("Unknown command");
        }

        return true;
    }

}
