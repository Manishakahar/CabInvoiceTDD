package com.blz.invoicegenrater.service;

import com.blz.invoicegenrater.model.InvoiceSummary;
import com.blz.invoicegenrater.model.Ride;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void  givenMultipleRide_WhenCalculateFare_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
       Ride[] rides ={new Ride(2.0,5),
               new Ride(1.0,5),
               new Ride(0.1,1)};
        double totalFare = invoiceService.calculateFare(rides);
        Assert.assertEquals(45,totalFare,0.0);
    }

    @Test
    public  void givenMultipleRidesCase3_whenCalculateFare_ShouldReturnAggregateTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(1.0, 5),
                new Ride(0.1, 1)};
        InvoiceSummary expectedSummery= new InvoiceSummary(3,45);
        InvoiceSummary actualSummery=invoiceService.calculateFares(rides);
        Assert.assertEquals(expectedSummery,actualSummery);
    }
    @Test
    public void givenUserID_whenCalculateFare_shouldReturnAggregateSummery() {
        InvoiceService invoiceService=new InvoiceService();
        String userName= "Riya, Manisha, ,Pooja";
        List<Ride> rideList=new ArrayList<>();
        rideList.add(new Ride(2.0,5));
        rideList.add(new Ride(1.0,5));
        rideList.add(new Ride(0.1,1));
        new UserAccount(userName,rideList);
        InvoiceSummary expectedSummery= new InvoiceSummary(3,45.0);
        InvoiceSummary actualSummery= invoiceService.InvoiceSummary(userName);
        Assert.assertEquals(expectedSummery,actualSummery);
    }
}

