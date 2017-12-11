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
        for(String routeString : routeStrings){
            routeList.add(new Route(routeString));
        }
    }

    public String routeDistance(String ... points) {
        int distancesum=0;
        for(int index=0; index<points.length-1; index++){
            int distance=0;
//            for (Route route : routeList) {
//                if (points[index].equals(route.getStartPoint()) &&
//                        points[index + 1].equals(route.getDesPoint())) {
//                    distance = route.getDistance();
//                    break;
//                }
//            }
            int finalIndex = index;
            distance = routeList.stream().filter(route -> points[finalIndex].equals(route.getStartPoint()) &&
                        points[finalIndex + 1].equals(route.getDesPoint()))
                    .map(route -> route.getDistance()).reduce(0, Integer::sum);
            if(distance == 0){
                return NO_SUCH_ROUTE;
            }
            distancesum += distance;
        }
        return String.valueOf(distancesum);
    }

//    public String tripsNum(String start, String end){
//        if()
//    }
}
