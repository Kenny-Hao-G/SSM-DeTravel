package com.deTravel.service.impl;

import com.deTravel.mapper.FlightMapper;
import com.deTravel.pojo.FlightInformation;
import com.deTravel.pojo.FlightInformationVo;
import com.deTravel.pojo.FlightWelfare;
import com.deTravel.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightMapper flightMapper;
    @Override
    public List<FlightInformation> selectFlight(FlightInformationVo flightInformation) {
        return flightMapper.selectFlight(flightInformation);
    }

    /**
     * 两次查询，第二次查询航班福利
     * @param id
     * @return
     */
    @Override
    public FlightInformation selectFlightDetailsById(int id) {
        FlightInformation flightInformation = flightMapper.selectFlightDetailsById(id);
        List<FlightWelfare> flightWelfares = flightMapper.selectFlightWelfare(id);
        flightInformation.setFlightWelfare(flightWelfares);
        return flightInformation;
    }
}
