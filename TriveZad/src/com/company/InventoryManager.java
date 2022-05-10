package com.company;

public class InventoryManager {

    private Inventory inventory;

    public InventoryManager(Inventory inventory) {
        this.inventory = inventory;
    }

    public boolean parseLine(String line) throws Exception {
        String[] lineSegments = line.split(" ");
        switch (lineSegments[0]){
            case "ADD":
                String skuString = lineSegments[1];
                String nameString = lineSegments[2];
                String quantityString = lineSegments[3];
                String priceString = lineSegments[4];
                Product product = new Product(Integer.parseInt(skuString), nameString, Double.parseDouble(priceString));
                inventory.addItems(product, Double.parseDouble(quantityString));
                break;
            case "END":
                return false;
            default:
                throw new Exception("Unknown command");
        }

        return true;
    }


}
