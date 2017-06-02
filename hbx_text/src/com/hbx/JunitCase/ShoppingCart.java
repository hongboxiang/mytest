package com.hbx.JunitCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<Item>();

    /**
     * ������Ʒ�����ﳵ
     * @param item
     * @param count
     * @throws NegativeCountException countΪ����ʱ����NegativeCountException
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
     * �ӹ��ﳵɾ����Ʒ
     * @param item
     * @param count
     * @throws NegativeCountException countΪ����ʱ����NegativeCountException
     * @throws NoSuchItemException ɾ������Ʒ�����ڣ���NoSuchItemException
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
