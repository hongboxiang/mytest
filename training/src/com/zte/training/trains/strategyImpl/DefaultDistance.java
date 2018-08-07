package com.zte.training.trains.strategyImpl;

import com.zte.training.trains.strategy.RouteDistance;
import com.zte.training.trains.strategy.Strategy;

import java.util.List;

import static com.zte.training.trains.common.Const.NO_SUCH_ROUTE;

/**
 * Created on 2018/3/6
 */
public class DefaultDistance extends Strategy implements RouteDistance {
    public DefaultDistance(int cityAmount, List<String> routeStrings) {
        super(cityAmount, routeStrings);
    }

    @Override
    public String getDistance(List<String> routes) {
        if(routes == null){
            return "-1";
        }
        int distancesum = 0;
        for (int index = 0; index < routes.size() - 1; index++) {
            int distance = cityMap.distanceFromStoD(routes.get(index), routes.get(index+1));
            if (distance == -1) {
                return NO_SUCH_ROUTE;
            }
            distancesum += distance;
        }
        return String.valueOf(distancesum);
    }
}
