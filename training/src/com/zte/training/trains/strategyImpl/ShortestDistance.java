package com.zte.training.trains.strategyImpl;

import com.zte.training.trains.strategy.RouteDistance;
import com.zte.training.trains.strategy.Strategy;

import java.util.List;

/**
 * Created on 2018/3/6
 */
public class ShortestDistance extends Strategy implements RouteDistance {
    private int bestCost;
    private String bestPath;

    public ShortestDistance(int cityAmount, List<String> routeStrings) {
        super(cityAmount, routeStrings);
    }

    @Override
    public String getDistance(List<String> routes) {
        if(routes.size() != 2){
            return "-1";
        }
        bestPath = "";
        bestCost = Integer.MAX_VALUE;
        dfs(routes.get(1), routes.get(0), 0);
        System.out.println(bestPath);
        return String.valueOf(bestCost);
    }

    private void dfs(String end, String path, int cost) {
        if (path.endsWith(end) && cost < bestCost && cost > 0) {
            bestPath = path;
            bestCost = cost;
            return;
        }
        char lastChar = path.charAt(path.length() - 1);

        for (int i = 0; i < cityAmount; i++) {
            char newChar = (char) (i + 'A');
            int newCost = cityMap.distanceFromStoD(String.valueOf(lastChar), String.valueOf(newChar));
            if (newCost > -1) {
                if (path.indexOf(newChar) > 0) {
                    continue;
                }
                dfs(end, path + newChar, cost + newCost);
            }
        }
    }
}
