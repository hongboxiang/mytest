package com.zte.training.trains;

import com.zte.training.trains.strategy.*;

import java.util.List;

/**
 * Created on 2018/3/5
 */
public class Context {

    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String getTripsNum(String start, String end, int stepnum){
        if(strategy instanceof CalTripsNum){
            return ((CalTripsNum)strategy).getTripsNum(start, end, stepnum);
        }
        return "-1";
    }

    public String getDistance(List<String> routes){
        if(strategy instanceof RouteDistance){
            return ((RouteDistance)strategy).getDistance(routes);
        }
        return "-1";
    }
}
