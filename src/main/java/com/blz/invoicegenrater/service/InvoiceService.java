package com.blz.invoicegenrater.service;

public class InvoiceService {
   private final double COST_PER_KM = 10.0;
   private final int COST_PER_MIN = 1;
   private final double MIN_FARE=5.0;

    public double calculateFare(double distance, int time) {
     double totalFare = distance * COST_PER_KM +time * COST_PER_MIN;
     return Math.max(totalFare,MIN_FARE);
    }
}
