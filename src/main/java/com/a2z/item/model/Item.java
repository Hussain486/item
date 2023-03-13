package com.a2z.item.model;

public class Item {
    String itemName;
    int itemId;

    double itemPrice;

    int custId;

    public Item() {
    }

    public Item(String itemName, int itemId, double itemPrice, int custId) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.custId = custId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemId=" + itemId +
                ", itemPrice=" + itemPrice +
                ", custId=" + custId +
                '}';
    }
}
