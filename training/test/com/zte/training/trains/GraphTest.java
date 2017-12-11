package com.zte.training.trains;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static com.zte.training.trains.Graph.NO_SUCH_ROUTE;
import static org.junit.Assert.assertEquals;

/**
 * Created on 2017/12/8
 */
public class GraphTest {
    Graph graph;
    @org.junit.Before
    public void setUp() throws Exception {
        List graphList = Arrays.asList("AB5", "BC4", "CD8", "DC8", "DE6", "AD5", "CE2", "EB3", "AE7");
        graph = new Graph(graphList);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void A_B_C() {
        assertEquals("9", graph.routeDistance("A", "B", "C"));
    }

    @Test
    public void A_D() {
        assertEquals("5", graph.routeDistance("A", "D"));
    }

    @Test
    public void A_D_C() {
        assertEquals("13", graph.routeDistance("A", "D", "C"));
    }

    @Test
    public void A_E_B_C_D() {
        assertEquals("22", graph.routeDistance("A", "E", "B", "C", "D"));
    }

    @Test
    public void A_E_D() {
        assertEquals(NO_SUCH_ROUTE, graph.routeDistance("A", "E", "D"));
    }

}