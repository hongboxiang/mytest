package com.tl.game.chainOfRespon;

import com.tl.game.chainOfRespon.rule.NormalRule;
import com.tl.game.chainOfRespon.rule.Rule;
import com.tl.game.chainOfRespon.rule.Rule1;
import com.tl.game.chainOfRespon.rule.Rule2;
import com.tl.game.chainOfRespon.teacher.AbsTeacher;

/**
 * Created on 2017/11/18
 */
public class ChildrenReport {
    public static final int MAX = 120;
    private final AbsTeacher teacher;

    public ChildrenReport(AbsTeacher teacher) {
        this.teacher = teacher;
    }

    public String report(int num) {
        checkNum(num);

        Rule rule1 = new Rule1();
        Rule rule2 = new Rule2();
        Rule normalRule = new NormalRule();
        rule2.setNextRule(rule1);
        rule1.setNextRule(normalRule);

        return rule2.reportByRule(num, teacher);
    }

    private void checkNum(int num) {
        if(num<=0 || num > MAX){
            throw new RuntimeException("num is incorrect.");
        }
    }

    String printCount(int num) {
        StringBuffer prints = new StringBuffer();
        int index = 1;
        for(;index<=num; index++){
            prints.append(report(index) + ",");
        }
        return prints.toString();
    }
}
