package com.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 2017/12/7
 */
@RunWith(Parameterized.class)
public class NiudanTest {
    double expected;
    Class input;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Parameterized.Parameters(name = "{index}:{1}种扭蛋_期望是{0}")
    public static Collection Niudans() {
        Object [][] object = {
                {3.0,StarWar.class},
                {11.4,YinSang.class},
        };
        return Arrays.asList(object);
    }

    public NiudanTest(double expected, Class input) {
        this.expected = expected;
        this.input = input;
    }

    @Test
    public void testNiudan() {
        assertThat(new Niudan(input).expect(), is(expected));
    }

}