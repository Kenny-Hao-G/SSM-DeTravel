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
public class FlightController {
    @Autowired
    FlightService flightService;
    @ApiOperation("通过条件查询航班信息")
    @RequestMapping(method = RequestMethod.POST,value = "/selectFlightInformation")
    @CrossOrigin
    public String getFlightInformation(FlightInformationVo flightInformationVo, Model model) {
        if (flightInformationVo.getDateOfDeparture() != null && flightInformationVo.getDateOfDeparture() != "") {
            String[] split = flightInformationVo.getDateOfDeparture().split(",");
            flightInformationVo.setDateOfDeparture(split[0]);
        }
        System.out.println(flightInformationVo);
        List<FlightInformation> flightInformations = flightService.selectFlight(flightInformationVo);
        System.out.println(flightInformations);
        model.addAttribute("flight",flightInformations);
        return flightInformations.size() > 0 ? "success" : "error";
    }
    @RequestMapping("/selectFlightDetailsById")
    @ResponseBody
    public String selectFlightDetailsById(int id,Model model) {
        FlightInformation flightInformation = flightService.selectFlightDetailsById(id);
        model.addAttribute("flight",flightInformation);
        return "";
    }
}
