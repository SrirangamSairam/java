package com.sai;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MMTSearchServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<AirlineFlightSearchInterface> airlineFlightSearchInterfaces = new ArrayList<>();
        airlineFlightSearchInterfaces.add(new AirIndiaFlightSearchService());
        airlineFlightSearchInterfaces.add(new IndigoFlightSearchService());
        MMTSearchService mmtSearchService = new MMTSearchService(airlineFlightSearchInterfaces);
        List<Flight> allFlights = mmtSearchService.getAllFlights("srpt","hyd", new Date());
        for(Flight flight: allFlights) {
            System.out.println(flight);
        }
    }
}
