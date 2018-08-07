package com.zte.training.trains;

import com.zte.training.trains.strategyImpl.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static com.zte.training.trains.common.Const.NO_SUCH_ROUTE;
import static org.junit.Assert.assertEquals;

/**
 * Created on 2017/12/8
 */
@RunWith(Parameterized.class)
public class DefaultDistanceTest {
    String expected ="";
    List routes = new ArrayList();

    @Parameterized.Parameters(name = "{index}: Distance of {1}")
    public static Collection defaultDistance(){
        Object[][] object = {
                {"9",Arrays.asList("A", "B", "C")},
                {"5",Arrays.asList("A", "D")},
                {"13",Arrays.asList("A", "D", "C")},
                {"22",Arrays.asList("A", "E", "B", "C", "D")},
                {NO_SUCH_ROUTE,Arrays.asList("A", "E", "D")},
        };
        return Arrays.asList(object);
    }

    public DefaultDistanceTest(String expected, List routes) {
        this.expected = expected;
        this.routes = routes;
    }

    List graphList;
    @org.junit.Before
    public void setUp() throws Exception {
        graphList = Arrays.asList("AB5", "BC4", "CD8", "DC8", "DE6", "AD5", "CE2", "EB3", "AE7");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void DefaultDistanceTest() {
        Context context = new Context(new DefaultDistance(5, graphList));
        assertEquals(expected, context.getDistance(routes));
    }
}