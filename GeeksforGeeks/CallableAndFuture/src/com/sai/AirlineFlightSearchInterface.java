package com.sai;

import java.util.Date;
import java.util.List;

public interface AirlineFlightSearchInterface {
    List<Flight> getFlightBySrcDstData(String src, String dst, Date date);
}
