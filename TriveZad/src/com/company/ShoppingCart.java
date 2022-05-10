package com.company;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Integer, ProductItem> inventoryItems;

    public ShoppingCart() {
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

    public void checkout(){
        double total = 0;
        for (ProductItem productItem :
                inventoryItems.values()) {
            double inventoryItemTotal = productItem.getQuantity()* productItem.getItem().getPrice();
            System.out.println(productItem.getItem().getName() + " "
                    + productItem.getQuantity() + " x "
                    + productItem.getItem().getPrice() + " = "
                    + inventoryItemTotal);
            total = total + inventoryItemTotal;



        }
        System.out.println("TOTAL = " + total);

        clear();
    }

    public void clear(){
        inventoryItems.clear();
    }


//    Program STDOUT:
//    T-shirt 1 x 5.99 = 5.99
//    Badge 3 x 0.99 = 2.97
//    TOTAL = 8.96


}
