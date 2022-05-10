package com.company;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<Integer, ProductItem> inventoryItems;

    public Inventory() {
        this.inventoryItems = new HashMap<>();
    }

    public void addItems(Product product, double quantity) {
        if (!inventoryItems.containsKey(product.getSku())) {
            inventoryItems.put(product.getSku(), new ProductItem(product, quantity));
        } else {
            ProductItem productItem = inventoryItems.get(product.getSku());
            productItem.setQuantity(productItem.getQuantity() + quantity);
        }
    }

    public ProductItem takeItems(Integer sku, double quantity) throws Exception {
        if (inventoryItems.containsKey(sku)){
            ProductItem productItem = inventoryItems.get(sku);
            productItem.setQuantity(productItem.getQuantity() - quantity);
            return new ProductItem(productItem.getItem(), quantity);
        }
        throw new Exception("The item doesn't exist");
    }

    public void printItems(){
        for (Integer key:
             inventoryItems.keySet()) {
            System.out.println(key + ": " + inventoryItems.get(key));
        }
    }

}
