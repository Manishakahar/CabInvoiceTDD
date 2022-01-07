package com.blz.invoicegenrater.model;

public class Ride {
    private double distance;
    private int time;
    private String rideType;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public Ride(double distance, int time, String rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
