package com.tl.game.chainOfRespon.teacher;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/11/30
 */
public class Teacher2 extends AbsTeacher{
    private Map<Integer, String> specials = new HashMap<>();

    @Override
    public Map<Integer, String> getSpecials() {
        specials.put(5, "Ê¯Í·");
        specials.put(7, "¼ôµ¶");
        specials.put(9, "²¼");
        return specials;
    }

    @Override
    public int getFirstNum() {
        return 5;
    }
}
