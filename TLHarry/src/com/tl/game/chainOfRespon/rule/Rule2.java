package com.tl.game.chainOfRespon.rule;

import com.tl.game.chainOfRespon.teacher.AbsTeacher;

/**
 * Created on 2017/11/30
 */
public class Rule2 extends Rule{

    @Override
    public String reportByRule(int n, AbsTeacher teacher) {
        String numString = String.valueOf(n);
        if(numString.contains(String.valueOf(teacher.getFirstNum()))){
            return teacher.getSpecials().get(teacher.getFirstNum());
        }
        return nextRule.reportByRule(n, teacher);
    }

}
