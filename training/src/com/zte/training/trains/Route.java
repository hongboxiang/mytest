package com.zte.training.trains;

import org.apache.commons.lang.StringUtils;
/**
 * Created on 2017/12/8
 */
public class Route {
    private String startPoint;
    private String desPoint;
    private int distance;

    public Route(String routeString) {
        this.startPoint = routeString.substring(0,1);
        this.desPoint = routeString.substring(1,2);
        this.distance = Integer.parseInt(routeString.substring(2,3));
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getDesPoint() {
        return desPoint;
    }

    public void setDesPoint(String desPoint) {
        this.desPoint = desPoint;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
