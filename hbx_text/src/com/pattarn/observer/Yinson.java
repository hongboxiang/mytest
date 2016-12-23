package com.pattarn.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 10180885 on 15-10-30.
 */
public class Yinson implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        if(arg.toString().equals("²ÝÝ®Å£ÄÌÒÑ³öÂ¯")) {
            System.out.println("°¡ " + arg.toString() + " ³Ô³Ô³Ô");
        }
    }
}
