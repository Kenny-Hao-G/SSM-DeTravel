package com.deTravel.service;

import com.deTravel.pojo.FlightInformation;
import com.deTravel.pojo.FlightInformationVo;

import java.util.List;

public interface FlightService {
    List<FlightInformation> selectFlight(FlightInformationVo flightInformation);

    FlightInformation selectFlightDetailsById(int id);
}
