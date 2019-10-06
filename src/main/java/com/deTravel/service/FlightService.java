package com.deTravel.service;

import com.deTravel.pojo.FlightInformation;
import com.deTravel.pojo.FlightInformationVo;

import java.util.List;

public interface FlightService {
    /**
     * 条件查询航班信息
     * @param flightInformation
     * @return
     */
    List<FlightInformation> selectFlight(FlightInformationVo flightInformation);

    /**
     * 查询指定id的航班
     * @param id
     * @return
     */
    FlightInformation selectFlightDetailsById(int id);
}
