package com.pattarn.observer;

import java.util.Observable;

/**
 * Created by 10180885 on 15-10-30.
 */
public class Food extends Observable{

    public void strawberryMilk() {
        System.out.println("��ݮţ���ѳ�¯");
        setChanged();
        notifyObservers("��ݮţ���ѳ�¯");
    }

    public void babecue() {
        System.out.println("�����ѳ�¯");
        setChanged();
        notifyObservers("�����ѳ�¯");
    }
}
