package com.hbx.JunitCase;

public class Item {
    private final String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (itemName != null ? !itemName.equals(item.itemName) : item.itemName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return itemName != null ? itemName.hashCode() : 0;
    }
}
