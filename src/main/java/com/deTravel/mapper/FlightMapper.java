package com.deTravel.mapper;

import com.deTravel.pojo.FlightInformation;
import com.deTravel.pojo.FlightInformationVo;
import com.deTravel.pojo.FlightWelfare;

import java.util.List;

public interface FlightMapper {
    /**
     * 查询符合条件的航班信息
     * @param flightInformation
     * @return
     */
    List<FlightInformation> selectFlight(FlightInformationVo flightInformation);

    /**
     * 查询指定id的航班信息
     * @param id
     * @return
     */
    FlightInformation selectFlightDetailsById(int id);

    /**
     * 查询指定航班的福利信息
     * @param id
     * @return
     */
    List<FlightWelfare> selectFlightWelfare(int id);
}
