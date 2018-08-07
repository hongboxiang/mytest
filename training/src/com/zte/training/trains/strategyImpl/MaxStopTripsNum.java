package com.zte.training.trains.strategyImpl;

import com.zte.training.trains.strategy.CalTripsNum;
import com.zte.training.trains.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/3/6
 */
public class MaxStopTripsNum extends Strategy implements CalTripsNum {
    private List<String> trips = new ArrayList<>();

    public MaxStopTripsNum(int cityAmount, List<String> routeStrings) {
        super(cityAmount, routeStrings);
    }

    @Override
    public String getTripsNum(String start, String end, int stepnum) {
        trips.clear();
        tripsNumMaxStep(end, start, stepnum);
        System.out.println(trips);
        return String.valueOf(trips.size());
    }

    private void tripsNumMaxStep(String end, String path, int stepnum) {
        if (path.length() - 1 > stepnum) return;
        if (path.length() > 1 && path.endsWith(end)) {
            trips.add(path);
        }
        char lastChar = path.charAt(path.length() - 1);

        for (int i = 0; i < cityAmount; i++) {
            char newChar = (char) (i + 'A');
            if (cityMap.isHaveRoute(String.valueOf(lastChar), String.valueOf(newChar))) {
                tripsNumMaxStep(end, path + newChar, stepnum);
            }
        }
    }
}
