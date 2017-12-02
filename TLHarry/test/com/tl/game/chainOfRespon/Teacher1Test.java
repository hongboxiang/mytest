package com.tl.game.chainOfRespon;

import java.util.Arrays;
import java.util.Collection;

import com.tl.game.chainOfRespon.teacher.Teacher1;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)   //1.����Ĭ�ϵĲ���������ΪRunWith(Parameterized.class)
public class Teacher1Test {
    ChildrenReport childrenReport;

    //2.�����������Ԥ��ֵ�Ͳ�������
    String expected ="";
    int input1 = 0;

    //3.����һ������ֵ ΪCollection�Ĺ�����̬��������ʹ��@Parameters��������
    @Parameters(name = "{index}: ��_{1}_���˱�_{0}")
    public static Collection ChildrenReportTest() {
        Object [][] object = {
                {"1",1},
                {"�ϻ�",3},
                {"����",5},
                {"��",7},
                {"29",29},
                {"�ϻ�����",15},
                {"�ϻ�",35},
                {"�ϻ����Ӽ�",105},
        };
        return Arrays.asList(object);
    }

    //4.Ϊ����������һ�����в����Ĺ������캯������������Ϊ֮����������ֵ
    public Teacher1Test(String expected, int input1) {
        this.expected = expected;
        this.input1 = input1;
    }

    @Before
    public void setUp() throws Exception {
        childrenReport = new ChildrenReport(new Teacher1());
    }

    //5.���в��Է�����������ɶԶ������ݵĲ���
    @Test
    public void testReport() {
        assertEquals(expected, childrenReport.report(input1));
    }

}