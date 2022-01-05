package com.blz.invoicegenrater.service;

import com.blz.invoicegenrater.model.Ride;

public class InvoiceService {
   private final double COST_PER_KM = 10.0;
   private final int COST_PER_MIN = 1;
   private final double MIN_FARE=5.0;

    public double calculateFare(double distance, int time) {
     double totalFare = distance * COST_PER_KM +time * COST_PER_MIN;
     return Math.max(totalFare,MIN_FARE);
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride: rides) {
            totalFare += calculateFare(ride.getDistance(),ride.getTime());
        }
        return  totalFare;
    }
}
