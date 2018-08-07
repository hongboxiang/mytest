package com.zte.training.trains.strategyImpl;

import com.zte.training.trains.strategy.CalTripsNum;
import com.zte.training.trains.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/3/6
 */
public class ExactlyStopTripsNum extends Strategy implements CalTripsNum {
    private List<String> trips = new ArrayList<>();

    public ExactlyStopTripsNum(int cityAmount, List<String> routeStrings) {
        super(cityAmount, routeStrings);
    }

    @Override
    public String getTripsNum(String start, String end, int stepnum) {
        trips.clear();
        tripsNumExactlyStep(end, start, stepnum);
        System.out.println(trips);
        return String.valueOf(trips.size());
    }

    private void tripsNumExactlyStep(String end, String path, int stepnum) {
        if (path.length() - 1 > stepnum) return;
        if (path.length() - 1 == stepnum && path.endsWith(end)) {
            trips.add(path);
            return;
        }
        char lastChar = path.charAt(path.length() - 1);

        for (int i = 0; i < cityAmount; i++) {
            char newChar = (char) (i + 'A');
            if (cityMap.isHaveRoute(String.valueOf(lastChar), String.valueOf(newChar))) {
                tripsNumExactlyStep(end, path + newChar, stepnum);
            }
        }
    }
}
