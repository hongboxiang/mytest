package com.zte.training.trains;

import com.zte.training.trains.strategyImpl.ExactlyStopTripsNum;
import com.zte.training.trains.strategyImpl.MaxDistanceTripsNum;
import com.zte.training.trains.strategyImpl.MaxStopTripsNum;
import com.zte.training.trains.strategyImpl.ShortestDistance;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created on 2017/12/8
 */
public class OtherStrategyTest {
    List graphList;
    @org.junit.Before
    public void setUp() throws FException {
        graphList = Arrays.asList("AB5", "BC4", "CD8", "DC8", "DE6", "AD5", "CE2", "EB3", "AE7");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void num_C_C() {
        Context context = new Context(new MaxStopTripsNum(5, graphList));
        assertEquals("2", context.getTripsNum("C", "C", 3));
    }

    @Test
    public void exactly_num_A_C() {
        Context context = new Context(new ExactlyStopTripsNum(5, graphList));
        assertEquals("3", context.getTripsNum("A", "C", 4));
    }

    @Test
    public void shortest_route_A_C() {
        Context context = new Context(new ShortestDistance(5, graphList));
        assertEquals("9", context.getDistance(Arrays.asList("A", "C")));
    }

    @Test
    public void shortest_route_B_B() {
        Context context = new Context(new ShortestDistance(5, graphList));
        assertEquals("9", context.getDistance(Arrays.asList("B", "B")));
    }

    @Test
    public void diff_route_num_C_C() {
        Context context = new Context(new MaxDistanceTripsNum(5, graphList));
        assertEquals("7", context.getTripsNum("C", "C", 30));
    }
}