package com.zte.training.trains;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2018/1/11
 */
public class CityMap {
    private int[][] cityMap;

    public CityMap(int cityAmount, List<String> routeStrings) {
        cityMap = new int[cityAmount][cityAmount];
        initCityMap(cityAmount, routeStrings);
    }

    private void initCityMap(int cityAmount, List<String> routeStrings) {
        for (int i = 0; i < cityAmount; i++) {
            Arrays.fill(cityMap[i], -1);
        }
        routeStrings.forEach(routeString -> cityMap[(int) routeString.charAt(0) - 'A'][(int) routeString.charAt(1) - 'A'] = Integer.parseInt(routeString.substring(2, 3)));
    }

    public Integer distanceFromStoD(String start, String des) {
        return cityMap[(int) start.charAt(0) - 'A'][(int) des.charAt(0) - 'A'];
    }

    public boolean isHaveRoute(String start, String des) {
        return cityMap[(int) start.charAt(0) - 'A'][(int) des.charAt(0) - 'A'] > -1;
    }
}
