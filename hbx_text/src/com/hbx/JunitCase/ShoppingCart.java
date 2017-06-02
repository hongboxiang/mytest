package com.hbx.JunitCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<Item>();

    /**
     * 增加商品到购物车
     * @param item
     * @param count
     * @throws NegativeCountException count为负数时，抛NegativeCountException
     */
    public void addItems(Item item, int count) throws NegativeCountException {
        checkRange(count);
        List<Item> newItems = new ArrayList<Item>(items);
        for (int i = 0; i < count; i++) {
            newItems.add(item);
        }
        items = newItems;
    }

    /**
     * 从购物车删除商品
     * @param item
     * @param count
     * @throws NegativeCountException count为负数时，抛NegativeCountException
     * @throws NoSuchItemException 删除的商品不存在，抛NoSuchItemException
     */
    public void deleteItems(Item item, int count) throws NegativeCountException,NoSuchItemException {
        checkRange(count);
        List<Item> newItems = new ArrayList<Item>(items);
        for (int i = 0; i < count; i++) {
            boolean success = newItems.remove(item);
            if (success) {
                continue;
            }
            throw new NoSuchItemException();
        }
        items = newItems;
    }

    private void checkRange(int count) throws NegativeCountException {
        if (count < 0) {
            throw new NegativeCountException();
        }
    }

    public int itemCount() {
        return items.size();
    }

    public Iterator<Item> iterator() {
        return items.iterator();
    }
}
