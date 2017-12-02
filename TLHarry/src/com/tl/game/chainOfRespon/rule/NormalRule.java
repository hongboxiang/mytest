package com.tl.game.chainOfRespon.rule;


import com.tl.game.chainOfRespon.teacher.AbsTeacher;

/**
 * Created on 2017/11/30
 */
public class NormalRule extends Rule{

    @Override
    public String reportByRule(int n, AbsTeacher teacher) {
        return String.valueOf(n);
    }
}
