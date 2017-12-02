package com.tl.game.chainOfRespon.rule;


import com.tl.game.chainOfRespon.teacher.AbsTeacher;


/**
 * Created on 2017/11/30
 */
public abstract class Rule {

    protected Rule nextRule;

    public void setNextRule(Rule nextRule){
        this.nextRule = nextRule;
    }

    public abstract String reportByRule(int n, AbsTeacher teacher);
}
