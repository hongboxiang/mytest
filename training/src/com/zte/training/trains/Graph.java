package com.zte.training.trains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created on 2017/12/8
 */
public class Graph {

    public static final String NO_SUCH_ROUTE = "NO SUCH ROUTE";
    private final List<Route> routeList = new ArrayList<>();

    public Graph(List<String> routeStrings) {
        routeStrings.forEach(routeString ->routeList.add(new Route(routeString)));
    }

    public String routeDistance(String ... points) {
        int distancesum=0;
        for(int index=0; index<points.length-1; index++){
            int finalIndex = index;
            int distance = distanceFromStoD(points[finalIndex], points[finalIndex+1]);
            if(distance == 0){
                return NO_SUCH_ROUTE;
            }
            distancesum += distance;
        }
        return String.valueOf(distancesum);
    }

    private Integer distanceFromStoD(String start, String des) {
        return routeList.stream().filter(route -> start.equals(route.getStartPoint()) &&
                des.equals(route.getDesPoint()))
                .map(route -> route.getDistance()).reduce(0, Integer::sum);
    }

//    public String tripsNum(String start, String end, int stepnum){
//        while (stepnum>0){
//            stepnum--;
//            if(start)
//        }
//    }
}
