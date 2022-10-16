package com.sai;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MMTSearchService {
    List<AirlineFlightSearchInterface> flightSearchServiceList;

    ExecutorService executorService = null;
    public MMTSearchService(List<AirlineFlightSearchInterface> flightSearchServiceList) {
        this.flightSearchServiceList = flightSearchServiceList;
        executorService = new ThreadPoolExecutor(5,10,5000, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>(10));
    }

    public List<Flight> getAllFlights(String src, String dst, Date date) throws InterruptedException, ExecutionException {
        List<Flight> allFlights = new ArrayList<>();
        List<Callable<List<Flight>>> callableList = new ArrayList<>();
        for (AirlineFlightSearchInterface flightService: flightSearchServiceList) {
            callableList.add(new Callable<List<Flight>>() {
                @Override
                public List<Flight> call() throws Exception {
                    return flightService.getFlightBySrcDstData(src,dst,date);
                }
            });
        }
        List<Future<List<Flight>>> futureList = executorService.invokeAll(callableList);
        for(Future<List<Flight>> future: futureList) {
            allFlights.addAll(future.get());
        }
        return allFlights;
    }
}
