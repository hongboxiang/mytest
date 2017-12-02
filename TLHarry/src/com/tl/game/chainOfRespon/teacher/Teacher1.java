package com.tl.game.chainOfRespon.teacher;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/11/30
 */
public class Teacher1 extends AbsTeacher {

    private Map<Integer, String> specials = new HashMap<>();

    @Override
    public Map<Integer, String> getSpecials() {
        specials.put(3, "�ϻ�");
        specials.put(5, "����");
        specials.put(7, "��");
        return specials;
    }

    @Override
    public int getFirstNum() {
        return 3;
    }
}
