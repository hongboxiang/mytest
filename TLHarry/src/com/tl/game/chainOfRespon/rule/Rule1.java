package com.tl.game.chainOfRespon.rule;

import com.tl.game.chainOfRespon.teacher.AbsTeacher;

import java.util.Map;

/**
 * Created on 2017/11/30
 */
public class Rule1 extends Rule{

    @Override
    public String reportByRule(int n, AbsTeacher teacher) {
        StringBuffer spec = new StringBuffer();
        for(Map.Entry<Integer, String> special : teacher.getSpecials().entrySet()){
            if(n%special.getKey() == 0){
                spec.append(special.getValue());
            }
        }
        if(!spec.toString().isEmpty()) {
            return spec.toString();
        }
        return nextRule.reportByRule(n, teacher);
    }
}
