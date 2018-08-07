package com.tl.game.chainOfRespon.rule;

import com.tl.game.chainOfRespon.teacher.AbsTeacher;

import java.util.Map;

/**
 * Created on 2017/11/30
 */
public class Rule1 extends Rule{
    private int num;
    private StringBuffer spec = new StringBuffer();

    @Override
    public String reportByRule(int n, AbsTeacher teacher) {
        num = n;
        teacher.getSpecials().forEach(this::setRule1Num);
        if(!spec.toString().isEmpty()) {
            return spec.toString();
        }
        return nextRule.reportByRule(n, teacher);
    }

    private void setRule1Num(int key, String value) {
        if(num%key == 0){
            spec.append(value);
        }
    }
}
