package com.blz.invoicegenrater.service;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    @Test
    public void  givenDistanceAndTimeCase1_WhenCalculateFare_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(2.0,5);
        Assert.assertEquals(25,totalFare,0.0);
    }

    @Test
    public void  givenDistanceAndTimeCase2_WhenCalculateFare_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(1.0,5);
        Assert.assertEquals(15,totalFare,0.0);
    }

    @Test
    public void  givenDistanceAndTimeCase3_WhenCalculateFareLessThen5_ShouldReturnTotalFareAs5() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(0.1,1);
        Assert.assertEquals(5,totalFare,0.0);
    }
}
