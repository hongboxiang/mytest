package com.zte.training.trains.strategy;

import com.zte.training.trains.CityMap;

import java.util.List;

/**
 * Created on 2018/3/6
 */
public abstract class Strategy {

    protected int cityAmount = 0;
    protected CityMap cityMap = null;

    public Strategy(int cityAmount, List<String> routeStrings) {
        this.cityAmount = cityAmount;
        cityMap = new CityMap(cityAmount, routeStrings);
    }
}
