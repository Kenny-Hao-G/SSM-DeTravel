package com.deTravel.mapper;

import com.deTravel.pojo.FlightInformation;
import com.deTravel.pojo.FlightInformationVo;

import java.util.List;

public interface FlightMapper {
    List<FlightInformation> selectFlight(FlightInformationVo flightInformation);

    FlightInformation selectFlightDetailsById(int id);
}
