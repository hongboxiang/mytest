package com.zte.training.trains.strategyImpl;

import com.zte.training.trains.strategy.CalTripsNum;
import com.zte.training.trains.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/3/6
 */
public class MaxDistanceTripsNum extends Strategy implements CalTripsNum {
    private List<String> trips = new ArrayList<>();

    public MaxDistanceTripsNum(int cityAmount, List<String> routeStrings) {
        super(cityAmount, routeStrings);
    }

    @Override
    public String getTripsNum(String start, String end, int maxCost) {
        trips.clear();
        tripsNumMaxStepDiffRoute(end, start, 0, maxCost);
        System.out.println(trips);
        return String.valueOf(trips.size());
    }

    private void tripsNumMaxStepDiffRoute(String end, String path, int cost, int maxCost) {
        if (cost >= maxCost)
            return;
        if (cost > 0 && path.endsWith(end)) {
            trips.add(path);
        }
        char lastChar = path.charAt(path.length() - 1);
        for (int i = 0; i < cityAmount; i++) {
            char newChar = (char) (i + 'A');
            int newCost = cityMap.distanceFromStoD(String.valueOf(lastChar), String.valueOf(newChar));
            if (newCost > -1) {
                tripsNumMaxStepDiffRoute(end, path + newChar, cost + newCost, maxCost);
            }
        }
    }
}
