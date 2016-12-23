package com.pattarn.observer;

import java.util.Observer;

/**
 * Created by 10180885 on 15-10-30.
 */
public class Client {
    public static void main(String[] args) {

        Observer yinson = new Yinson();
        Food food = new Food();

        food.addObserver(yinson);

        food.strawberryMilk();
        food.babecue();

    }
}
