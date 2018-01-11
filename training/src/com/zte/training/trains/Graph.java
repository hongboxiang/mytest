package com.zte.training.trains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2017/12/8
 */
public class Graph {

    static final String NO_SUCH_ROUTE = "NO SUCH ROUTE";
    private static int cityAmount = 5;
    private static int[][] cityMap;
    private List<String> trips = new ArrayList<>();
    private int bestCost;
    private String bestPath;

    public Graph(int cityAmount, List<String> routeStrings) {
        this.cityAmount = cityAmount;
        initCityMap(cityAmount, routeStrings);
    }

    private void initCityMap(int cityAmount, List<String> routeStrings) {
        cityMap = new int[cityAmount][cityAmount];
        for (int i = 0; i < cityAmount; i++) {
            Arrays.fill(cityMap[i], -1);
        }
        routeStrings.forEach(routeString ->cityMap[(int)routeString.charAt(0)-'A'][(int)routeString.charAt(1)-'A'] = Integer.parseInt(routeString.substring(2, 3)));
    }

    public String routeDistance(String ... points) {
        int distancesum=0;
        for(int index=0; index<points.length-1; index++){
            int distance = distanceFromStoD(points[index], points[index +1]);
            if(distance == -1){
                return NO_SUCH_ROUTE;
            }
            distancesum += distance;
        }
        return String.valueOf(distancesum);
    }

    private Integer distanceFromStoD(String start, String des) {
        return cityMap[(int)start.charAt(0)-'A'][(int)des.charAt(0)-'A'];
    }

    public int calTripsNum(String start, String end, int stepnum){
        trips.clear();
        tripsNumMaxStep(end, start, stepnum);
        System.out.println(trips);
        return trips.size();
    }

    public int calTripsNumExactly(String start, String end, int stepnum){
        trips.clear();
        tripsNumExactlyStep(end, start, stepnum);
        System.out.println(trips);
        return trips.size();
    }

    public int shortestRoute(String start, String end){
        bestPath = "";
        bestCost = Integer.MAX_VALUE;
        dfs(end, start, 0);
        System.out.println(bestPath);
        return bestCost;
    }

    public int calTripsNumDiffRoute(String start, String end, int cost){
        trips.clear();
        tripsNumMaxStepDiffRoute(end, start, 0);
        System.out.println(trips);
        return trips.size();
    }

    private void tripsNumMaxStepDiffRoute(String end, String path, int cost){
        if (cost >= 30)
            return;
        if (cost > 0 && path.endsWith(end)) {
            trips.add(path);
        }
        char lastChar = path.charAt(path.length() - 1);
        int lastNodeIndex = lastChar - 'A';
        for (int i = 0; i < cityMap[lastNodeIndex].length; i++) {
            char newChar = (char) (i + 'A');
            int newCost = distanceFromStoD(String.valueOf(lastChar), String.valueOf(newChar));
            if (newCost > -1) {
                tripsNumMaxStepDiffRoute(end, path + newChar, cost + newCost);
            }
        }
    }

    private void dfs(String end, String path, int cost){
        if (path.endsWith(end) && cost < bestCost && cost > 0) {
            bestPath = path;
            bestCost = cost;
            return;
        }
        char lastChar = path.charAt(path.length()-1);

        for (int i = 0; i< cityAmount; i++ )
        {
            char newChar = (char)(i + 'A');
            int newCost = distanceFromStoD(String.valueOf(lastChar), String.valueOf(newChar));
            if(newCost>-1){
                if(path.indexOf(newChar)>0){
                    continue;
                }
            dfs(end, path + newChar, cost + newCost);
            }
        }
    }

    private void tripsNumMaxStep(String end, String path, int stepnum){
        if (path.length() - 1 > stepnum) return;
        if ( path.length() > 1 && path.endsWith(end) ) {
            trips.add(path);
        }
        char lastChar = path.charAt(path.length()-1);

        for (int i = 0; i< cityAmount; i++ )
        {
            char newChar = (char)(i + 'A');
            if(isHaveRoute(String.valueOf(lastChar), String.valueOf(newChar))){
                tripsNumMaxStep(end, path + newChar, stepnum);
            }
        }
    }

    private void tripsNumExactlyStep(String end, String path, int stepnum){
        if (path.length() - 1 > stepnum) return;
        if (path.length() - 1 == stepnum && path.endsWith(end) ) {
            trips.add(path);
            return;
        }
        char lastChar = path.charAt(path.length()-1);

        for ( int i=0; i<cityAmount; i++ )
        {
            char newChar = (char)(i + 'A');
            if(isHaveRoute(String.valueOf(lastChar), String.valueOf(newChar))){
                tripsNumExactlyStep(end, path + newChar, stepnum);
            }
        }
    }

    private boolean isHaveRoute(String start, String des) {
        return cityMap[(int)start.charAt(0)-'A'][(int)des.charAt(0)-'A'] > -1;
    }
}
