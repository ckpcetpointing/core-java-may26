package com.jsn.core.java.oops.abstraction.interf;

public abstract class HeliCopterTransportService  implements AirTransportService {


    @Override
    public void estimateTravelTime(String source, String destination) {
        System.out.println("Estimating travel time for helicopter from " + source + " to " + destination);
    }

    @Override
    public void bookTransport(String source, String destination) {
        System.out.println("Booking helicopter transport from " + source + " to " + destination);
    }
}
