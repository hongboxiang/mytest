package com.tl.game.chainOfRespon;

import com.tl.game.chainOfRespon.teacher.Teacher1;
import com.tl.game.chainOfRespon.teacher.Teacher2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)   //1.更改默认的测试运行器为RunWith(Parameterized.class)
public class Teacher2Test {
    ChildrenReport childrenReport;

    //2.声明变量存放预期值和测试数据
    String expected ="";
    int input1 = 0;

    //3.声明一个返回值 为Collection的公共静态方法，并使用@Parameters进行修饰
    @Parameters(name = "{index}: 第_{1}_个人报_{0}")
    public static Collection ChildrenReportTest() {
        Object [][] object = {
                {"1",1},
                {"石头",5},
                {"剪刀",7},
                {"布",9},
                {"29",29},
                {"石头",35},
                {"剪刀布",63},
        };
        return Arrays.asList(object);
    }

    //4.为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值
    public Teacher2Test(String expected, int input1) {
        this.expected = expected;
        this.input1 = input1;
    }

    @Before
    public void setUp() throws Exception {
        childrenReport = new ChildrenReport(new Teacher2());
    }

    //5.运行测试方法，即可完成对多组数据的测试
    @Test
    public void testReport() {
        assertEquals(expected, childrenReport.report(input1));
    }

}