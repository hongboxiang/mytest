package com.tl.herry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created on 2017/11/1
 */
public class Bookstore {
    double[] discount = {0, 1, 2 * 0.95, 3 * 0.9, 4 * 0.8, 5 * 0.75};
    int price = 8;
    int partCount = 5;

    public double calBestPrice(int[] bookBusket) {
        List<Double> prices = new ArrayList<>();
        if (bookBusket == null || bookBusket.length != this.partCount || isContainNegative(bookBusket)) {
            throw new RuntimeException("bookBusket is incorrect.");
        }

        int[] sortedBookBusket = Arrays.copyOf(bookBusket, bookBusket.length);
        Arrays.sort(sortedBookBusket);

        int selectedPartAmount = getSelectedPartAmount(sortedBookBusket);
        if (selectedPartAmount == 0) {
            return 0;
        }
        for (; selectedPartAmount > 0; selectedPartAmount--) {
            prices.add(this.price * this.discount[selectedPartAmount] + calBestPrice(getRestbookBusket(sortedBookBusket, selectedPartAmount)));
        }
        return getMin(prices);
    }

    private boolean isContainNegative(int[] bookBusket) {
        for (int i : bookBusket) {
            if (i < 0) {
                return true;
            }
        }
        return false;
    }

    private int getSelectedPartAmount(int[] sortedBookBusket) {
        int selectedPartAmount = 0;
        for (int i : sortedBookBusket) {
            if (i > 0) {
                selectedPartAmount++;
            }
        }
        return selectedPartAmount;
    }

    private int[] getRestbookBusket(int[] bookBusket, int selectedPartAmount) {
        int[] restbookBusket = Arrays.copyOf(bookBusket, bookBusket.length);
        for (; selectedPartAmount > 0; selectedPartAmount--) {
            restbookBusket[this.partCount - selectedPartAmount] = bookBusket[this.partCount - selectedPartAmount] - 1;
        }
        return restbookBusket;
    }

    private double getMin(List<Double> prices) {
        Collections.sort(prices);
        return prices.get(0);
    }
}
