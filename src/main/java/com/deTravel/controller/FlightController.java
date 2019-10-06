package com.deTravel.controller;

import com.deTravel.pojo.FlightInformation;
import com.deTravel.pojo.FlightInformationVo;
import com.deTravel.service.FlightService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(value = "航班操作", tags = "航班操作")
@RequestMapping("/flight")
@ResponseBody
@CrossOrigin(origins = "*", allowedHeaders="*")
public class FlightController {
    @Autowired
    FlightService flightService;
    @ApiOperation("通过条件查询航班信息")
    @RequestMapping(method = RequestMethod.POST,value = "/selectFlightInformation")
    /**
     * 条件查询航班信息
     * 通过单选框选择是否有返程信息
     */
    public String getFlightInformation(FlightInformationVo flightInformationVo, Model model) {
        if (flightInformationVo.getDateOfDeparture() != null) {
            String[] split = flightInformationVo.getDateOfDeparture().split(",");
            flightInformationVo.setDateOfDeparture(split[0]);
        }
        List<FlightInformation> flightInformations = flightService.selectFlight(flightInformationVo);
        List<FlightInformation> returnFlight = null;
        if (flightInformationVo.getIds() == null) {
            String[] returnDate = flightInformationVo.getReturnDate().split(",");
            flightInformationVo.setDateOfDeparture(returnDate[0]);
            returnFlight = flightService.selectFlight(flightInformationVo);

        }
        return flightInformations.size() > 0 || returnFlight != null ? "success" : "error";
    }
    @ApiOperation("查询指定id的航班信息")
    @RequestMapping(method = RequestMethod.POST,value = "/selectFlightDetailsById")
    @ResponseBody
    /**
     * 用户点击航班查看详细信息
     * 通过航班id查询
     */
    public String selectFlightDetailsById(int id,Model model) {
        FlightInformation flightInformation = flightService.selectFlightDetailsById(id);
        return flightInformation != null ? "success" : "error";
    }

}
