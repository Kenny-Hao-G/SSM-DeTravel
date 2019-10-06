package com.deTravel.controller;

import com.deTravel.pojo.TbArea;
import com.deTravel.service.TravelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/travel")
@Api(value = "旅游", tags = "旅游操作")
public class TravelController {
    @Autowired
    TravelService travelService;
    @Value("${IMG_PATH}")
    String IMG_PATH;
    @Value("${IMG_URL}")
    String IMG_URL;

    /**
     * 登山
     */
    @RequestMapping(value = "/dengshan", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "进入登山页面")
    public String dengshan(TbArea tbArea, Model model) {
        List<TbArea> listArea = travelService.selectAllArea(tbArea);
        model.addAttribute("listArea", listArea);
        return "success";
    }
}
